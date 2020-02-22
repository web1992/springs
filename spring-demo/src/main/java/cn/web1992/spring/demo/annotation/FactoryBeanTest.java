package cn.web1992.spring.demo.annotation;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2020/2/22  23:40
 */
@Configuration
public class FactoryBeanTest implements FactoryBean<Cat> {

    private String name = "factoryBeanTest";

    @Override
    public Cat getObject() throws Exception {
        return new Cat("ManFen");
    }

    @Override
    public Class<?> getObjectType() {
        return Cat.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public String toString() {
        return "FactoryBeanTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
