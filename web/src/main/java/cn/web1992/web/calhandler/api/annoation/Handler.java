package cn.web1992.web.calhandler.api.annoation;

import cn.web1992.web.calhandler.api.HandlersId;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author web1992
 * @date 2019/12/30  23:14
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Handler {

    /**
     * handler 顺序
     *
     * @return
     */
    int value() default Integer.MIN_VALUE;

    /**
     * 是否系统添加到计算链中
     *
     * @return
     */
    boolean addToChain() default true;

    /**
     * @return
     */
    HandlersId id() default HandlersId.NONE;


}
