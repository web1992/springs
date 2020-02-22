package cn.web1992.spring.demo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author web1992
 * @date 2020/2/22  19:33
 * 用来创建  Person 和 Student
 */
@Configuration
public class PeopleFactory {

    @Bean
    public Person createPerson() {
        return new Person("Lucy", 18);
    }

    @Bean
    public Student createStudent() {
        return new Student("Tom");
    }
}
