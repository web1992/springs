package cn.web1992.spring.demo.annotation;

/**
 * @author web1992
 * @date 2020/2/23  00:46
 */
@MyAnnotation
public class Car {

    private String name="Car";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
