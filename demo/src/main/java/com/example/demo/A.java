package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author web1992
 * @date 2019/11/28  23:25
 */
@Component("componentA")
public class A {
    private A() {
    }

    private A(B b) {
        this.b = b;
    }

    @Autowired
    private B b;


    public String getDesc(){
        return "Hello from A";
    }


    public void init() {
        System.out.println("init B");
    }
}
