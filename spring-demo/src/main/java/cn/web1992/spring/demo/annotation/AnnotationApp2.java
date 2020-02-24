package cn.web1992.spring.demo.annotation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author web1992
 * @date 2020/2/22  20:54
 * @desc PersonFactory 测试
 */
public class AnnotationApp2 {

    private static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context;
        context = new AnnotationConfigApplicationContext();
        context.scan("cn.web1992.spring.demo");
        context.refresh();

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("beanName " + beanName);
        }

        BeanDefinition peopleFactory = context.getBeanDefinition("peopleFactory");
        BeanDefinition createStudent = context.getBeanDefinition("createStudent");
        BeanDefinition annotationDemo = context.getBeanDefinition("annotationDemo");

        System.out.println("peopleFactory is " + peopleFactory);
        System.out.println("createStudent is " + createStudent);
        System.out.println("annotationDemo is " + annotationDemo);
        System.out.println("annotationDemo is " + context.getBean("annotationDemo"));

//        Person person = context.getBean(Person.class);
//        Car car = context.getBean(Car.class);
//        System.out.println("person is " + person);
//        System.out.println("car is " + car);
//        Object createPerson = context.getBean("createPerson");
//        System.out.println(createPerson);
    }


}
