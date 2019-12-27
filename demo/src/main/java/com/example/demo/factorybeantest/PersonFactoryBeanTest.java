package com.example.demo.factorybeantest;

import com.example.demo.Person;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2019/12/23  18:39
 */
@Configuration
public class PersonFactoryBeanTest implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        Person person = new Person();

        person.setAge(100);
        person.setName("I am create by FactoryBeanTest");
        return person;
    }

    @Override
    public Class<Person> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
