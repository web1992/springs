package com.example.demo.beantest;

import com.example.demo.ComponentA;
import com.example.demo.ComponentB;
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
        if (bean instanceof ComponentB) {
            System.out.println("BeanTest postProcessBeforeInitialization beanName " + beanName);
        }
        if (bean instanceof ComponentA) {
            System.out.println("BeanTest postProcessBeforeInitialization beanName " + beanName);
        }
        return null;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ComponentB) {
            System.out.println("BeanTest postProcessAfterInitialization beanName " + beanName);
        }
        if (bean instanceof ComponentA) {
            System.out.println("BeanTest postProcessAfterInitialization beanName " + beanName);
        }
        return null;
    }
}
