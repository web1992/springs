package com.example.demo.beantest;

import com.example.demo.A;
import com.example.demo.B;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2019/12/4  23:02
 */
@Configuration
public class BeanTest implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof B) {
            System.out.println("BeanTest postProcessBeforeInitialization beanName " + beanName);
        }
        if (bean instanceof A) {
            System.out.println("BeanTest postProcessBeforeInitialization beanName " + beanName);
        }
        return null;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof B) {
            System.out.println("BeanTest postProcessAfterInitialization beanName " + beanName);
        }
        if (bean instanceof A) {
            System.out.println("BeanTest postProcessAfterInitialization beanName " + beanName);
        }
        return null;
    }
}
