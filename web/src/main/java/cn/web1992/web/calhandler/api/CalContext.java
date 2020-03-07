package cn.web1992.web.calhandler.api;

/**
 * @author web1992
 * @date 2020/3/7  21:50
 */
public class CalContext {

    private String id;

    private String param;

    private String calResult;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getCalResult() {
        return calResult;
    }

    public void setCalResult(String calResult) {
        this.calResult = calResult;
    }
}
