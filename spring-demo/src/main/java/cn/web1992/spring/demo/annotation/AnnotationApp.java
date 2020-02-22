package cn.web1992.spring.demo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author web1992
 * @date 2020/2/16  20:54
 */
public class AnnotationApp {

    private static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext();
        context.scan("cn.web1992.spring.demo");
        context.refresh();
        AnnotationDemo annotationDemo = context.getBean(AnnotationDemo.class);
        System.out.println("name is " + annotationDemo.getName());

        System.out.println("=========================================");
        printBeans();
        System.out.println("=========================================");
        // 通过 Spring 创建对象
        // 可以调用被 spring  管理的方法 比如 InitializingBean 的 afterPropertiesSet
        Config config = context.getAutowireCapableBeanFactory().createBean(Config.class);
        System.out.println("config name is " + config.getName());

        System.out.println("=========================================");
        printBeans();

    }


    static void printBeans() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

}
