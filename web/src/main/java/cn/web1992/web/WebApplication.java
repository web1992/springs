package cn.web1992.web;

import cn.web1992.web.service.lunch.Lunch;
import cn.web1992.web.service.lunch.LunchServiceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author web1992
 */
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);

        testLunch();

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
