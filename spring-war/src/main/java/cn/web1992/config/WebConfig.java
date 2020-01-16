package cn.web1992.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2020/1/16  16:53
 */
@Configuration
public class WebConfig {

    public WebConfig() {
        System.out.println("WebConfig init");
    }

    @Bean
    public AA getAA() {
        return new AA();
    }

    public static class AA {

        public AA() {
            System.out.println("AA init");
        }

        public String hello() {
            return "Hello from AA";
        }
    }
}


