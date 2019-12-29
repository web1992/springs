package cn.web1992.controller;

import cn.web1992.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class IndexController {


    private static Logger LOG = LoggerFactory.getLogger(IndexController.class);


    @Autowired
    private UserService service;

    /**
     * 这里让spring 来控制主页，web.xml 的 welcome-file-list  不起作用
     *
     * @return index.vm
     */
    @RequestMapping(value = {" ", "/"})
    @ResponseBody
    public String index(HttpServletRequest request, HttpServletResponse response) throws IOException, InterruptedException {
        Map<String, String> paramMap = getParamMap(request.getParameterMap());
        service.sayName();
        LOG.info("paramMap={}" + paramMap);
        return "200";
    }


    @RequestMapping(value = {"/index2"}, params = {"a=123"})
    @ResponseBody
    public String index2() {
        return "index2";
    }

    @RequestMapping(value = {"/demo"})
    @ResponseBody
    private String demo() {
        ModelAndView modelAndView = new ModelAndView();
        List<String> list = new ArrayList<>();
        modelAndView.addObject(list);
        return "demo";
    }

    private Map<String, String> getParamMap(Map<String, String[]> parameterMap) {
        if (parameterMap.size() > 0) {
            Map<String, String> map = new HashMap<>();
            for (String _key : parameterMap.keySet()) {
                map.put(_key, parameterMap.get(_key)[0]);
            }
            return map;
        }
        return null;
    }
}
