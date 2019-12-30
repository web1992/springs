package cn.web1992.web.service.lunch;

import java.util.HashMap;
import java.util.Map;

/**
 * @author web1992
 * @date 2019/12/30  23:01
 */
public class LunchServiceFactory {


    /**
     * 存储所有的 LunchService 对象
     */
    private static final Map<String, LunchService> MAP = new HashMap<>();

    public static void addService(String name, LunchService lunchService) {
        MAP.put(name, lunchService);
    }

    public static LunchService getService(String name) {
        return MAP.get(name);
    }
}
