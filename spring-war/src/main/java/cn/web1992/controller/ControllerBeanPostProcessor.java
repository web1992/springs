package cn.web1992.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2019/12/4  23:02
 * 测试使用
 */
@Configuration
public class ControllerBeanPostProcessor extends TempClass implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof IndexController) {
            System.out.println("ControllerBeanPostProcessor postProcessBeforeInitialization beanName= " + beanName + " thread name " + Thread.currentThread().getName());
        }
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof IndexController) {
            System.out.println("ControllerBeanPostProcessor postProcessAfterInitialization beanName= " + beanName + " thread name " + Thread.currentThread().getName());
        }
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // 这里会打印两次 WebApplicationContext
        // 因为在 ContextLoaderListener 和 DispatcherServlet 中都被加载了
        // Root WebApplicationContext
        // setApplicationContext applicationContext= WebApplicationContext for namespace 'dispatcherServlet-servlet'
        System.out.println("setApplicationContext applicationContext= " + applicationContext);
    }
}

class TempClass implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
