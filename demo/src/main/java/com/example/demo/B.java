package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author web1992
 * @date 2019/11/28  23:25
 */
@Component
public class B {
    private A a;

    @Autowired
    public void setA(A a) {
        this.a = a;
    }

    @Autowired
    public void init() {
        System.out.println("init A");
    }
}
