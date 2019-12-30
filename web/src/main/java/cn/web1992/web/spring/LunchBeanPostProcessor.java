package cn.web1992.web.spring;

import cn.web1992.web.service.lunch.LunchApi;
import cn.web1992.web.service.lunch.LunchService;
import cn.web1992.web.service.lunch.LunchServiceFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2019/12/4  23:02
 */
@Configuration
public class LunchBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        // 注册所有使用了 LunchApi 注解的类
        if (bean instanceof LunchService) {
            LunchApi annotation = bean.getClass().getAnnotation(LunchApi.class);
            if (null != annotation) {
                LunchServiceFactory.addService(annotation.value(), (LunchService) bean);
            }
        }
        return bean;
    }
}
