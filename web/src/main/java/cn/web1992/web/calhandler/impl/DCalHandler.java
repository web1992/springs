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
@Handler(value = 1,id = HandlersId.D)
public class DCalHandler extends AbstractCalHandler implements CalHandler {

    @Override
    public void cal(CalContext calContext, CalHandlerChain calHandlerChain) {
        System.out.println("cal D...");
        int index = calContext.getParam().indexOf("D");
        if (index == -1) {
            return ;
        }
        calContext.setCalResult(calContext.getCalResult() + "D");
        calHandlerChain.doCal(calContext);
    }
}
