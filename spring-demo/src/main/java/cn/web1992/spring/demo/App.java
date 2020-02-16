package cn.web1992.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author web1992
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.start();
        Demo demo = context.getBean(Demo.class);
        System.out.println(" name is " + demo.getName());
    }
}
