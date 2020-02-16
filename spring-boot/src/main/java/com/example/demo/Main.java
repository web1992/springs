package com.example.demo;

import com.example.demo.factorybeantest.PersonFactoryBeanTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author web1992
 * @date 2019/12/7  22:26
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(ClassPathXmlApplicationContext.class);

    static ClassPathXmlApplicationContext context = null;

    public static void main(String[] args) {

        try {
            context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
            context.start();
            logger.info(">>>>>>>>>>> Service started!");
            {
//                testA();
//                testService();
//                testPerson();
                testPersonFactoryBeanTest();
            }
            // to prevent jvm exit
            System.in.read();
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(), e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != context && context.isActive()) {
                try {
                    context.stop();
                } catch (Exception e) {
                    logger.error(e.getLocalizedMessage(), e);
                }
            }
        }
    }

    private static void testPersonFactoryBeanTest() throws Exception {
        PersonFactoryBeanTest bean = context.getBean(PersonFactoryBeanTest.class);
        logger.info("testPersonFactoryBeanTest bean is {}", bean);
        logger.info("testPersonFactoryBeanTest getObject is {}", bean.getObject());
    }

    private static void testPerson() {
        Person person = context.getBean(Person.class);
        // person bean is Person{name='I am create by FactoryBeanTest', age=100}
        logger.info("person bean is {}", person);
    }

    private static void testService() {
        Service service = context.getBean(Service.class);
        logger.info("Service bean is {}", service);
    }

    private static void testA() {
        ComponentA componentA = context.getBean(ComponentA.class);
        logger.info("A bean is {}", componentA);
    }
}
