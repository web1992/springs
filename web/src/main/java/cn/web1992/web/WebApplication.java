package cn.web1992.web;

import cn.web1992.web.mapper.UserMapper;
import cn.web1992.web.service.lunch.Lunch;
import cn.web1992.web.service.lunch.LunchServiceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author web1992
 */
@SpringBootApplication
public class WebApplication {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(WebApplication.class, args);

//        testLunch();
        testMapper();

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
