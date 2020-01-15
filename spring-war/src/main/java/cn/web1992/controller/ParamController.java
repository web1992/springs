package cn.web1992.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author web1992
 * @date 2020/1/14  17:44
 */
@RequestMapping(value = {"/param"})
@Controller
public class ParamController {

    /**
     * curl "http://127.0.0.1:8080/param/test?name=1"
     *
     * @param name name
     * @return
     * @throws Exception
     */
    @RequestMapping(value = {"test"})
    @ResponseBody
    public String param(@RequestParam("name") String name) throws Exception {
        return "param name is " + name;
    }
}
