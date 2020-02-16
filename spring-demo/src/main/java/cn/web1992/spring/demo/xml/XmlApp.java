package cn.web1992.spring.demo.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author web1992
 */
public class XmlApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        context.start();
        XmlDemo xmlDemo = context.getBean(XmlDemo.class);
        System.out.println(" name is " + xmlDemo.getName());
    }
}
