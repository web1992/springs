package cn.web1992.spring.demo.initializingbean;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author web1992
 * @date 2020/2/16  21:13
 */
public class Config implements InitializingBean {

    private String name = "config";

    public Config() {
        System.out.println("Config init ");
    }

    public Config(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Config afterPropertiesSet ...");
    }
}
