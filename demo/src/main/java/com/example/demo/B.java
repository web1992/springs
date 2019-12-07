package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author web1992
 * @date 2019/11/28  23:25
 */
@Component("componentB")
public class B {
    @Autowired
    private A a;
    public void init() {
        System.out.println("init A");
    }
}
