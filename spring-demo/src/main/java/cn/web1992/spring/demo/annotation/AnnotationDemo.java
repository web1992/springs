package cn.web1992.spring.demo.annotation;

import org.springframework.stereotype.Component;

/**
 * @author web1992
 * @date 2020/2/16  20:47
 */
@Component
public class AnnotationDemo {

    private String name = "AnnotationDemo";

    public AnnotationDemo(String name) {
        this.name = name;
    }

    public AnnotationDemo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
