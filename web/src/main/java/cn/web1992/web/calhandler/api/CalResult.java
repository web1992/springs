package cn.web1992.web.calhandler.api;

/**
 * @author web1992
 * @date 2020/3/7  21:51
 */
public class CalResult {

    private Boolean suc;

    private String errorMsg;

    public Boolean getSuc() {
        return suc;
    }

    public void setSuc(Boolean suc) {
        this.suc = suc;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "CalResult{" +
                "suc=" + suc +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
