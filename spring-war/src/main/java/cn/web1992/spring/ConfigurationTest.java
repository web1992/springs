package cn.web1992.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2020/1/20  23:03
 */
public class ConfigurationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        MyBean myBean = ctx.getBean(MyBean.class);
        // use myBean ...ø
        System.out.println(myBean);
    }


    static class MyBean {

        String name;

        public MyBean(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "MyBean{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    @Configuration
    static class AppConfig {

        @Bean
        MyBean getBean() {
            return new MyBean("Spring");
        }
    }
}
