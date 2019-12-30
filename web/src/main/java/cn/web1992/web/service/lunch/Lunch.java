package cn.web1992.web.service.lunch;

/**
 * @author web1992
 * @date 2019/12/30  23:05
 */
public class Lunch {
    private String name;

    private String siteAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    @Override
    public String toString() {
        return "Lunch {" +
                "name='" + name + '\'' +
                ", siteAddress='" + siteAddress + '\'' +
                '}';
    }
}
