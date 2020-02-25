package cn.web1992.spring.demo.configuration;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author web1992
 * @date 2020/2/24  20:54
 * @desc @Configuration 测试
 * @see org.springframework.context.annotation.ConfigurationClassPostProcessor
 * @see org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader#loadBeanDefinitionsForBeanMethod
 */
public class ConfigurationTest {

    private static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext();
        context.scan("cn.web1992.spring.demo.configuration");
        context.refresh();

        CCTV cctv1 = context.getBean("cctv1", CCTV.class);
        CCTV cctv2 = context.getBean("cctv2", CCTV.class);

        cctv1.say();
        cctv2.say();

        TVFactory tvFactory = context.getBean(TVFactory.class);
        // cn.web1992.spring.demo.configuration.TVFactory$$EnhancerBySpringCGLIB$$c0b37840@2b4a2ec7
        System.out.println(tvFactory);
        BeanDefinition bdf = context.getBeanDefinition("TVFactory");
        System.out.println(bdf);
    }


}
