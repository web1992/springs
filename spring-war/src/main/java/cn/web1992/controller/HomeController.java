package cn.web1992.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * <pre>
 *     命令: curl -H "Content-Type: application/xml"  127.0.0.1:8080/home
 *
 *     输出: home xml
 *
 *     命令: curl -H "Content-Type: application/json"  127.0.0.1:8080/hom
 *
 *     输出: home json
 * </pre>
 */
@Controller("homeController")
public class HomeController {

    private static Logger LOG = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = {"/home"}, consumes = {"application/json"}, method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String homeJson(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "home json";
    }

    @RequestMapping(value = {"/home"}, consumes = {"application/xml"})
    @ResponseBody
    public String homeXml(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "home xml";
    }

    /**
     * curl -H "A:a"  127.0.0.1:8080/head
     */
    @RequestMapping(value = {"/head"}, headers = {"A=a"})
    @ResponseBody
    public String headA(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "head A";
    }

    /**
     * curl -H "A:b"  127.0.0.1:8080/head
     */
    @RequestMapping(value = {"/head"}, headers = {"A=b"})
    @ResponseBody
    public String headB(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "head B";
    }

    /**
     * curl -i "127.0.0.1:8080/param?a=1"
     */
    @RequestMapping(value = {"/param"}, params = {"a=1"})
    @ResponseBody
    public String param(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "param";
    }

    @RequestMapping(value = {"/{vv}/v"})
    @ResponseBody
    public String vv(HttpServletRequest request, HttpServletResponse response, @PathVariable(value = "vv") String vv) throws Exception {

        return "vv is " + vv;
    }
}
