package cn.web1992.spring.demo.circular.reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author web1992
 * @date 2020/2/24  20:13
 * @see org.springframework.beans.factory.BeanCurrentlyInCreationException
 */
@Component
public class AA {

    @Autowired
    private BB b;

    public AA() {
        System.out.println("AA init");
    }
}
