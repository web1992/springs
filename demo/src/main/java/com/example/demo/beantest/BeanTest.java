package com.example.demo.beantest;

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
        System.out.println("BeanTest postProcessBeforeInitialization");
        return null;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanTest postProcessAfterInitialization");
        return null;
    }
}
