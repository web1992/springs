package cn.web1992.web;

import cn.web1992.web.calhandler.api.CalContext;
import cn.web1992.web.calhandler.api.CalHandlerFactory;
import cn.web1992.web.mapper.UserMapper;
import cn.web1992.web.service.lunch.Lunch;
import cn.web1992.web.service.lunch.LunchServiceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author web1992
 */
@SpringBootApplication
public class WebApplication {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(WebApplication.class, args);
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        testLunch();
//        testMapper();


        testCalHandler();


    }


    private static void testCalHandler() {
        CalContext calContext = new CalContext();
        calContext.setParam("ABCD");
        CalHandlerFactory.startCal(calContext);
        System.out.println("cal result " + calContext.getCalResult());
        calContext.setCalResult(null);

        System.out.println("================");
        calContext.setParam("ECABD");
        CalHandlerFactory.startCal(calContext);
        System.out.println("cal result " + calContext.getCalResult());
        calContext.setCalResult(null);

        System.out.println("================");
        calContext.setParam("BCDE");
        CalHandlerFactory.startCal(calContext);
        System.out.println("cal result " + calContext.getCalResult());
        calContext.setCalResult(null);
        System.out.println("================");
        calContext.setParam("ABCDE");
        CalHandlerFactory.startCal(calContext, Arrays.asList("A", "B"));
        System.out.println("cal result " + calContext.getCalResult());
    }


    private static void testMapper() {
        UserMapper bean = context.getBean(UserMapper.class);
        bean.sayHello();
    }

    private static void testLunch() {
        Lunch meituan = LunchServiceFactory.getService("meituan").createLunch();
        Lunch ele = LunchServiceFactory.getService("ele").createLunch();

        System.out.println("meituan " + meituan);
        System.out.println("ele " + ele);

        // out put is:
        // meituan Lunch {name='Mei tuan lunch', siteAddress='https://www.meituan.com/'}
        // ele Lunch {name='Ele lunch', siteAddress='https://www.ele.me/'}
    }
}
