package com.yefan.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


/**
 * Spring初始化bean时对外暴露的扩展点
 *
 * 实现该接口，可以在spring的bean创建之前，修改bean的定义属性。也就是说，
 * Spring允许BeanFactoryPostProcessor在容器实例化任何其它bean之前读取配置元数据，
 * 并可以根据需要进行修改，例如可以把bean的scope从singleton改为prototype，
 * 也可以把property的值给修改掉。可以同时配置多个BeanFactoryPostProcessor，
 * 并通过设置'order'属性来控制各个BeanFactoryPostProcessor的执行次序。
 * 注意：BeanFactoryPostProcessor是在spring容器加载了bean的定义文件之后，
 * 在bean实例化之前执行的。接口方法的入参是ConfigurrableListableBeanFactory，
 * 使用该参数，可以获取到相关bean的定义信息
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        super();
        System.out.println("这是BeanFactoryPostProcessor实现类构造器！！");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        System.out
                .println("BeanFactoryPostProcessor调用postProcessBeanFactory方法");
        BeanDefinition bd = arg0.getBeanDefinition("person");
        bd.getPropertyValues().addPropertyValue("phone", "110");
    }

}
