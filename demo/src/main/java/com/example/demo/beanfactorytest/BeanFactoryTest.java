package com.example.demo.beanfactorytest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2019/12/4  22:56
 */
@Configuration
public class BeanFactoryTest implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryTest");
        BeanDefinition componentB = beanFactory.getBeanDefinition("componentB");

        System.out.println(componentB);
    }
}
