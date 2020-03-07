package cn.web1992.web.calhandler.api;

/**
 * @author web1992
 * @date 2020/3/7  23:21
 */
public class DefaultCalHandlerChain implements CalHandlerChain {


    private int size;

    private int pos;

    private CalHandler[] calHandlers;


    protected void setCalHandlersList(CalHandler[] calHandlers) {
        this.calHandlers = calHandlers;
        this.size = calHandlers.length;
        this.pos = 0;
    }


    @Override
    public void doCal(CalContext calContext) {

        if (pos < size) {
            CalHandler calHandler = calHandlers[pos++];
            calHandler.cal(calContext, this);
        }
    }
}
