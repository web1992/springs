package cn.web1992.web.calhandler.impl;

import cn.web1992.web.calhandler.api.CalContext;
import cn.web1992.web.calhandler.api.CalHandler;
import cn.web1992.web.calhandler.api.CalHandlerChain;
import cn.web1992.web.calhandler.api.annoation.Handler;
import cn.web1992.web.calhandler.api.enums.HandlersId;
import org.springframework.stereotype.Service;

/**
 * @author web1992
 * @date 2020/3/7  22:25
 */
@Service
@Handler(value = 60, id = HandlersId.E)
public class ECalHandler extends AbstractCalHandler implements CalHandler {

    @Override
    public void cal(CalContext calContext, CalHandlerChain calHandlerChain) {
        System.out.println("cal E...");

        int index = calContext.getParam().indexOf("E");
        if (index == -1) {
            return;
        }
        calContext.setCalResult(calContext.getCalResult() + "E");
        calHandlerChain.doCal(calContext);
    }

}
