package cn.web1992.web.calhandler.api;

import cn.web1992.web.calhandler.api.enums.HandlersId;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author web1992
 * @date 2020/3/7  22:12
 */
public class CalHandlerFactory {

    private static volatile Boolean init = false;

    private static CalHandler calHandler;

    private static final List<CalHandlerHolder> CAL_HANDLER_HOLDERS = new ArrayList<>();

    public static void addCalHandler(CalHandler calHandler, Integer priority, HandlersId id) {
        CAL_HANDLER_HOLDERS.add(new CalHandlerHolder(priority, calHandler, id));
    }


    public static void startCal(CalContext calContext) {

        CalHandlerChain chain = createChain();

        chain.doCal(calContext);
    }

    public static void startCal(CalContext calContext, List<String> excludeHandler) {

        CalHandlerChain chain = createChain(excludeHandler);

        chain.doCal(calContext);
    }


    private static CalHandlerChain createChain(List<String> excludeHandler) {

        DefaultCalHandlerChain defaultCalHandlerChain = new DefaultCalHandlerChain();

        List<String> exclude = null == excludeHandler ? Collections.emptyList() : excludeHandler;

        List<CalHandlerHolder> holderList = CAL_HANDLER_HOLDERS
                .stream()
                .filter(h -> !exclude.contains(h.id.name()))
                .sorted()
                .collect(Collectors.toList());


        int size = holderList.size();

        List<CalHandler> list = new ArrayList<>(size);

        for (int i = 0; i < holderList.size(); i++) {
            list.add(holderList.get(i).calHandler);
        }

        defaultCalHandlerChain.setCalHandlersList(list.toArray(new CalHandler[size]));
        return defaultCalHandlerChain;
    }

    private static CalHandlerChain createChain() {
        return createChain(null);
    }


    static class CalHandlerHolder implements Comparable<CalHandlerHolder> {


        private Integer priority;

        private CalHandler calHandler;

        private HandlersId id;

        public CalHandlerHolder(Integer priority, CalHandler calHandler, HandlersId id) {
            this.priority = priority;
            this.calHandler = calHandler;
            this.id = id;
        }


        @Override
        public int compareTo(CalHandlerHolder o) {

            return o.priority.compareTo(this.priority);
        }
    }


}
