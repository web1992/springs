package cn.web1992.samples.xml;

import cn.web1992.Desc;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * desc: 文件注释
 * <p>
 * Version		1.0.0
 *
 * @author web1992
 * <p>
 * Date	      2019/1/17 12:16
 */
public class DescBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class getBeanClass(Element element) {
        return Desc.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        // this will never be null since the schema explicitly requires that a value be supplied
        String name = element.getAttribute("name");
        bean.addConstructorArgValue(name);

        // this however is an optional property
        String domain = element.getAttribute("domain");
        if (StringUtils.hasText(domain)) {
            bean.addPropertyValue("domain", domain);
        }
        // this however is an optional property
        String blog = element.getAttribute("blog");
        if (StringUtils.hasText(blog)) {
            bean.addPropertyValue("blog", blog);
        }
    }
}
