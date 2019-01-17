package cn.web1992;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 * @author web1992
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.start();
        DemoBean demoService = context.getBean("demoBean", DemoBean.class);
        System.out.println("result: " + demoService.getDesc());
    }
}
