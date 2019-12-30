package cn.web1992.web.service.lunch;

import org.springframework.stereotype.Service;

/**
 * @author web1992
 * @date 2019/12/30  23:06
 * 饿了么
 */
@Service
@LunchApi("ele")
public class EleLunchService implements LunchService {
    /**
     * 创建午餐
     * @return
     */
    @Override
    public Lunch createLunch() {
        Lunch lunch = new Lunch();
        lunch.setName("Ele lunch");
        lunch.setSiteAddress("https://www.ele.me/");
        return lunch;
    }
}
