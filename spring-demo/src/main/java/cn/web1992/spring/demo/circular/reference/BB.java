package cn.web1992.spring.demo.circular.reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author web1992
 * @date 2020/2/24  20:13
 */
@Component
public class BB {

    @Autowired
    private AA aa;

    public BB() {
        System.out.println("BB init");
    }
}
