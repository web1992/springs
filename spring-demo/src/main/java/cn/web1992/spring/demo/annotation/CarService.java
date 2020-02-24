package cn.web1992.spring.demo.annotation;

import org.springframework.stereotype.Component;

/**
 * @author web1992
 * @date 2020/2/23  22:27
 */
@Component
public class CarService {
    public CarService() {
        System.out.println("CarService init");
    }
}
