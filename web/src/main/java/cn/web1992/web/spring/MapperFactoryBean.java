package cn.web1992.web.spring;

import cn.web1992.web.mapper.MapperProxy;
import cn.web1992.web.mapper.UserMapper;
import cn.web1992.web.mapper.UserMapperImpl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Proxy;

/**
 * @author web1992
 * @date 2020/2/16  21:47
 * 模拟 mybatis 中的 mapper 映射
 */
@Configuration
public class MapperFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return createProxy();
    }

    @Override
    public Class<?> getObjectType() {
        return UserMapper.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    /**
     * 创建 proxy 代理
     *
     * @return
     */
    private Object createProxy() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Object o = Proxy.newProxyInstance(contextClassLoader, new Class[]{UserMapper.class}, new MapperProxy(new UserMapperImpl()));
        return o;
    }
}
