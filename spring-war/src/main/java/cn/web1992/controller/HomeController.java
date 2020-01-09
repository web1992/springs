package cn.web1992.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


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

    /**
     * @param request  request
     * @param response response
     * @return
     * @throws Exception
     */
    @RequestMapping(value = {"/home"}, consumes = {"application/json"})
    @ResponseBody
    public String homeJson(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "home json";
    }

    @RequestMapping(value = {"/home"}, consumes = {"application/xml"})
    @ResponseBody
    public String homeXml(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "home xml";
    }
}
