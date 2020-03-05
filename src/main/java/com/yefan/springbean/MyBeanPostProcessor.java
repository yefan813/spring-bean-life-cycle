package com.yefan.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        System.out.println("����BeanPostProcessorʵ���๹��������");
        // TODO Auto-generated constructor stub
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("BeanPostProcessor�ӿڷ���postProcessBeforeInitialization�����Խ��и��ģ�");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("BeanPostProcessor�ӿڷ���postProcessAfterInitialization�����Խ��и��ģ�");
        return bean;
    }


}
