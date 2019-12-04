package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author web1992
 * @date 2019/11/28  23:25
 */
@Component("componentA")
public class A {

    @Autowired
    private B b;


    @Autowired
    public void init() {
        System.out.println("init B");
    }
}
