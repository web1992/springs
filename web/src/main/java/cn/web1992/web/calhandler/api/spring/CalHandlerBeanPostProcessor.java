package cn.web1992.web.calhandler.api.spring;

import cn.web1992.web.calhandler.api.CalHandler;
import cn.web1992.web.calhandler.api.CalHandlerFactory;
import cn.web1992.web.calhandler.api.annoation.Handler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2019/12/4  23:02
 */
@Configuration
public class CalHandlerBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof CalHandler) {
            Handler annotation = bean.getClass().getAnnotation(Handler.class);
            if (null != annotation) {
                CalHandlerFactory.addCalHandler((CalHandler) bean, annotation.value(), annotation.id());
            }
        }
        return bean;
    }
}
