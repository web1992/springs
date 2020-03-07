package cn.web1992.web.calhandler.api;

/**
 * @author web1992
 * @date 2020/3/7  21:51
 */
public interface CalHandler {

    void cal(CalContext calContext, CalHandlerChain calHandlerChain);

}
