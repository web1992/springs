package com.example.demo.controller;

import com.example.demo.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangerbao
 * @date 2019/12/7  21:18
 */
@RestController
public class AController {

    @Autowired
    private A a;

    @GetMapping("a")
    public String a() {
        return "From AController is " + a.getDesc();
    }
}
