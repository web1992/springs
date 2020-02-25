package cn.web1992.spring.demo.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author web1992
 * @date 2020/2/25  22:25
 */
public class AutowiredMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context;
        context = new AnnotationConfigApplicationContext();
        context.scan("cn.web1992.spring.demo.autowired");
        context.refresh();

        CarService carService = context.getBean(CarService.class);
        CarFactory carFactory = context.getBean(CarFactory.class);

        System.out.println(carService);
        System.out.println(carFactory);
    }
}
