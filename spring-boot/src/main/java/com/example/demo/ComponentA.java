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

    /**
     * Error creating bean with name 'componentA': Requested bean is currently in creation: Is there an unresolvable circular reference?
     * at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:732)
     *
     * @param componentB
     */
    // @Autowired
    // 构造方法注入，无法解决循环依赖的问题
    private ComponentA(ComponentB componentB) {
        this.componentB = componentB;
    }

    @Autowired
    private ComponentB componentB;


    public String getDesc() {
        return "Hello from A";
    }


    public void init() {
        System.out.println("init A");
    }
}
