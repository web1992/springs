package cn.web1992.spring.demo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author web1992
 * @date 2020/2/16  20:54
 */
public class AnnotationApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("cn.web1992.spring.demo");
        context.refresh();
        AnnotationDemo annotationDemo = context.getBean(AnnotationDemo.class);
        System.out.println(" name is " + annotationDemo.getName());
    }

}
