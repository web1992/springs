package cn.web1992.spring.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2020/2/25  14:51
 * @desc 被 Configuration 修饰的类，会进行生产代理，增强
 *
 * <pre>
 *     1. 使用 `ConfigurationClassPostProcessor` 拦截 Spring 的 `BeanPostProcessor` 过程
 *     2. 使用 `CGLIB` 对 `@Configuration` 注解类进行代理增强，目的是拦截所有有 `@Bean` 注解的方法调用
 *     3. 解析类，扫描所有@Bean 方法的，创建 `ConfigurationClassBeanDefinition`
 *        并执行 `registry.registerBeanDefinition` 注册 `BeanDef`
 * </pre>
 */
@Configuration
public class TVFactory {

    public TVFactory() {
        System.out.println("TVFactory init");
    }

    @Bean("cctv1")
    public CCTV createCCTV1() {
        return new CCTV1("CCTV1");
    }

    @Bean("cctv2")
    public CCTV createCCTV2() {
        return new CCTV1("CCTV2");
    }
}
