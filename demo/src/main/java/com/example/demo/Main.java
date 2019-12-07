package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wev1992
 * @date 2019/12/7  22:26
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(ClassPathXmlApplicationContext.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = null;

        try {
            context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
            context.start();
            logger.info(">>>>>>>>>>> Service started!");
            System.in.read();
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(), e);
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
}
