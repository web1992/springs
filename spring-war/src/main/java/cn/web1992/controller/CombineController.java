package cn.web1992.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @link {https://github.com/web1992/read/blob/master/spring/spring-mvc/spring-web-request-condition.md#requestconditioncombine}
 */
@Controller("combineController")
@RequestMapping(value = {"/combine"}, method = {RequestMethod.POST})
public class CombineController {

    /**
     * GET 请求
     * curl  127.0.0.1:8080/combine/test
     * <p>
     * 输出：combine method is: GET
     * <p>
     * POST 请求
     * <p>
     * curl  -d "a=1"  127.0.0.1:8080/combine/test
     * <p>
     * 输出：combine method is: POST
     */
    @RequestMapping(value = {"/test"})
    // @RequestMapping(value = {"/test"}, method = {RequestMethod.GET})
    @ResponseBody
    public String combine(HttpServletRequest request) throws Exception {

        return "combine method is: " + request.getMethod();
    }
}