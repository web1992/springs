package cn.web1992.web.calhandler.impl;

import cn.web1992.web.calhandler.api.CalContext;
import cn.web1992.web.calhandler.api.CalHandler;
import cn.web1992.web.calhandler.api.HandlersId;
import cn.web1992.web.calhandler.api.annoation.Handler;
import cn.web1992.web.calhandler.api.CalHandlerChain;
import org.springframework.stereotype.Service;

/**
 * @author web1992
 * @date 2020/3/7  21:52
 */
@Service
@Handler(value = 5,id = HandlersId.B)
public class BCalHandler extends AbstractCalHandler implements CalHandler {


    @Override
    public void cal(CalContext calContext, CalHandlerChain calHandlerChain) {
        System.out.println("cal B...");

        int index = calContext.getParam().indexOf("B");
        if (index == -1) {
            return;
        }
        calContext.setCalResult(calContext.getCalResult() + "B");
        calHandlerChain.doCal(calContext);
    }
}
