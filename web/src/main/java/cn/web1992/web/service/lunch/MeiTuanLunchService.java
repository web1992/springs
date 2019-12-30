package cn.web1992.web.service.lunch;

import org.springframework.stereotype.Service;

/**
 * @author web1992
 * @date 2019/12/30  23:06
 * 美团
 */
@Service
@LunchApi("meituan")
public class MeiTuanLunchService implements LunchService {
    /**
     * 创建午餐
     *
     * @return
     */
    @Override
    public Lunch createLunch() {
        Lunch lunch = new Lunch();
        lunch.setName("Mei tuan lunch");
        lunch.setSiteAddress("https://www.meituan.com/");
        return lunch;
    }
}
