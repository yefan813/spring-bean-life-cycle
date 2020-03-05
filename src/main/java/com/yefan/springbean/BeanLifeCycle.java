package com.yefan.springbean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanLifeCycle {

    public static void main(String[] args) {

        System.out.println("���ڿ�ʼ��ʼ������");
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("������ʼ���ɹ�");
        //�õ�Preson����ʹ��
        Person person = factory.getBean("person",Person.class);
        System.out.println(person);

        System.out.println("���ڿ�ʼ�ر�������");
        ((ClassPathXmlApplicationContext)factory).registerShutdownHook();
    }
}
