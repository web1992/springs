package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author web1992
 * @date 2019/11/28  23:25
 */
@Component("componentB")
public class ComponentB {
    private ComponentB() {
        System.out.println("construct B run");
    }

    @Autowired
    private ComponentA componentA;

    public void init() {
        System.out.println("init B");
    }
}
