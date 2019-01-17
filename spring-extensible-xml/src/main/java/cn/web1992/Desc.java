package cn.web1992;

/**
 * desc: 文件注释
 * <p>
 * Version		1.0.0
 *
 * @author web1992
 * <p>
 * Date	      2019/1/17 15:26
 */
public class Desc {
    private String name;
    private String domain;
    private String blog;


    public Desc() {
    }

    public Desc(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "Desc{" + "name='" + name + '\'' + ", domain='" + domain + '\'' + ", blog='" + blog + '\'' + '}';
    }
}
