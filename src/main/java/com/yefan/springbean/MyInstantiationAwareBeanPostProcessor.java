package com.yefan.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 *
 */
public class MyInstantiationAwareBeanPostProcessor extends
        InstantiationAwareBeanPostProcessorAdapter {

    public MyInstantiationAwareBeanPostProcessor() {
        super();
        System.out
                .println("����InstantiationAwareBeanPostProcessorAdapterʵ���๹��������");
    }

    // �ӿڷ�����ʵ����Bean֮ǰ����
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass,
                                                 String beanName) throws BeansException {
        System.out
                .println("InstantiationAwareBeanPostProcessor����postProcessBeforeInstantiation����");
        return null;
    }

    // �ӿڷ�����ʵ����Bean֮�����
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out
                .println("InstantiationAwareBeanPostProcessor����postProcessAfterInitialization����");
        return bean;
    }

    // �ӿڷ���������ĳ������ʱ����
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs,
                                                    PropertyDescriptor[] pds, Object bean, String beanName)
            throws BeansException {
        System.out
                .println("InstantiationAwareBeanPostProcessor����postProcessPropertyValues����");
        return pvs;
    }
}
