package cn.web1992.spring.demo.configuration;

/**
 * @author web1992
 * @date 2020/2/25  14:52
 */
public class CCTV2 implements CCTV {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CCTV2(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Hello from " + name);
    }

}
