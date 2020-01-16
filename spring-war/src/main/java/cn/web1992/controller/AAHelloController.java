package cn.web1992.controller;

import cn.web1992.config.WebConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author web1992
 * @date 2020/1/16  16:59
 */
@RestController
public class AAHelloController {

    @Autowired
    private WebConfig.AA a;

    @RequestMapping(value = {"/hello"})
    public String hello() throws Exception {
        return a.hello();
    }

}
