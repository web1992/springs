package cn.web1992.spring.demo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author web1992
 * @date 2020/2/22  20:54
 * @desc  FactoryBeanTest 测试
 */
public class AnnotationApp3 {

    private static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext();
        context.scan("cn.web1992.spring.demo");
        context.refresh();

        Cat catByClass = context.getBean(Cat.class);
        FactoryBeanTest factoryBeanTest = (FactoryBeanTest)context.getBean("&factoryBeanTest");

        System.out.println("cat is " + catByClass);
        System.out.println("factoryBeanTest is " + factoryBeanTest);
    }


}
