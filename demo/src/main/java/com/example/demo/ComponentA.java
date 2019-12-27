package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author web1992
 * @date 2019/11/28  23:25
 */
@Component("componentA")
public class ComponentA {
    private ComponentA() {
        System.out.println("construct A run");
    }

    private ComponentA(ComponentB componentB) {
        this.componentB = componentB;
    }

    @Autowired
    private ComponentB componentB;


    public String getDesc(){
        return "Hello from A";
    }


    public void init() {
        System.out.println("init A");
    }
}
