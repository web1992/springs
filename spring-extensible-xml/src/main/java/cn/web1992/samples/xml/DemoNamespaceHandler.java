package cn.web1992.samples.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * desc: 文件注释
 * <p>
 * Version		1.0.0
 *
 * @author web1992
 * <p>
 * Date	      2019/1/17 12:13
 */
public class DemoNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("desc", new DescBeanDefinitionParser());
    }
}
