package cn.web1992.controller;

import cn.web1992.exception.RestException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author web1992
 * @date 2020/1/15  17:08
 */
@Controller("exception")
@RequestMapping(value = {"/exception"})
public class ExceptionController {

    @RequestMapping(value = {"/test"})
    @ResponseBody
    public String exception() throws Exception {

        if (1 == 1) {
            throw new RestException("eeeeeeeee....");
        }
        return "exception";
    }

    @RequestMapping(value = {"/throwable"})
    @ResponseBody
    public String throwable() throws Throwable {

        if (1 == 1) {
            throw new Throwable("eeeeeeeee....");
        }
        return "throwable";
    }
}
