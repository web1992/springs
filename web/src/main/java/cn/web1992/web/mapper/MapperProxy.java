package cn.web1992.web.mapper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author web1992
 * @date 2020/2/16  21:51
 */
public class MapperProxy implements InvocationHandler {

    private Object object;

    public MapperProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String targetMethodName = method.getName();


        Class[] clazz = null;
        if (null != args) {
            clazz = new Class[args.length];
            int index = 0;
            for (Object o : args) {
                clazz[index] = o.getClass();
                index++;
            }
        }


        Method imlMethod = object.getClass().getMethod(targetMethodName, clazz);

        return imlMethod.invoke(object, args);
    }
}
