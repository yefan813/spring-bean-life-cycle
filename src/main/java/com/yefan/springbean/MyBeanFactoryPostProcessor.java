package com.yefan.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


/**
 * Spring��ʼ��beanʱ���Ⱪ¶����չ��
 *
 * ʵ�ָýӿڣ�������spring��bean����֮ǰ���޸�bean�Ķ������ԡ�Ҳ����˵��
 * Spring����BeanFactoryPostProcessor������ʵ�����κ�����bean֮ǰ��ȡ����Ԫ���ݣ�
 * �����Ը�����Ҫ�����޸ģ�������԰�bean��scope��singleton��Ϊprototype��
 * Ҳ���԰�property��ֵ���޸ĵ�������ͬʱ���ö��BeanFactoryPostProcessor��
 * ��ͨ������'order'���������Ƹ���BeanFactoryPostProcessor��ִ�д���
 * ע�⣺BeanFactoryPostProcessor����spring����������bean�Ķ����ļ�֮��
 * ��beanʵ����֮ǰִ�еġ��ӿڷ����������ConfigurrableListableBeanFactory��
 * ʹ�øò��������Ի�ȡ�����bean�Ķ�����Ϣ
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        super();
        System.out.println("����BeanFactoryPostProcessorʵ���๹��������");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
            throws BeansException {
        System.out
                .println("BeanFactoryPostProcessor����postProcessBeanFactory����");
        BeanDefinition bd = arg0.getBeanDefinition("person");
        bd.getPropertyValues().addPropertyValue("phone", "110");
    }

}
