package cn.web1992.service;

/**
 * author: web1992
 * date: 2017/11/15
 * time: 17:27
 * Description:
 */
public class UserServiceImpl implements UserService {


    public UserServiceImpl() {
        System.out.println("UserServiceImpl init");
    }

    private LoginService loginService;

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public void sayName() {
        System.out.println("sayName");
        System.out.println("UserServiceImpl:sayName loginService=" + loginService);
    }

    public void init() {
        System.out.println("UserServiceImpl:init");
        System.out.println("UserServiceImpl:init loginService=" + loginService);
    }
}

