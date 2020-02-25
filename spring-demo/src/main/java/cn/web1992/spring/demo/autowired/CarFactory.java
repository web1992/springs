package cn.web1992.spring.demo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author web1992
 * @date 2020/2/16  20:47
 */
@Component
public class CarFactory {

    private String name = "annotationDemo";

    @Autowired
    private CarService carService;

    public CarFactory(String name) {
        this.name = name;
        System.out.println("AnnotationDemo init with name arg");
    }

    public CarFactory() {
        System.out.println("AnnotationDemo init with no args");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnnotationDemo{" +
                "name='" + name + '\'' +
                ", carService=" + carService +
                '}';
    }
}
