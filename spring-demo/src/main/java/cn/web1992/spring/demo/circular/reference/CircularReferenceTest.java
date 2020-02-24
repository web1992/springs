package cn.web1992.spring.demo.circular.reference;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author web1992
 * @date 2020/2/24  20:54
 * @desc 循环引用 测试
 */
public class CircularReferenceTest {

    private static AnnotationConfigApplicationContext context;

    /** Spring 中的循环依赖
     * 1. AA -> BB
     *    如果 AA 依赖 BB，正常情况下，会先创建AA对象(使用构造方法创建AA对象)，缓存AA 对象，然后进行依赖注入，执行getBean 方法，进行 BB 的创建
     * 2. AA -> BB -> AA
     *    先创建AA，然后缓存AA 对象，在创建BB 对象，缓存BB对象，由于BB 依赖AA ，这时候去创建AA，
     *    这时候AA已经缓存中了，直接使用缓存中的AA，就可以进行BB 的依赖注入
     *    在等BB 创建完毕，在回来继续进行AA的依赖注入，注入BB 对象
     * 3. 无法解决构造方法的循环依赖，原因：
     *    在使用构造方法创建AA的时候，会先去创建BB，但是BB依赖AA，会去创建AA，但是由于AA还没在缓存中，会造成死循环，内存溢出
     * 4. 只有单例才会进行缓存，因此单例情况下，能解决循环依赖的问题
     * addSingletonFactory
     * @param args
     */
    public static void main(String[] args) {

        context = new AnnotationConfigApplicationContext();
        context.scan("cn.web1992.spring.demo.circular.reference");
        context.refresh();

    }


}
