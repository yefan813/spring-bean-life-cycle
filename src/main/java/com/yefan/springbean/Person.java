package com.yefan.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * beanʵ��������
 *
 * @author yefan
 */
public class Person implements BeanFactoryAware, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;
    private String address;
    private int phone;


    private BeanFactory beanFactory;
    private String beanName;
    private ApplicationContext applicationContext;

    public Person() {
        System.out.println("��������������Person�Ĺ�����ʵ����");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("��ע�����ԡ�ע������name");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("��ע�����ԡ�ע������address");
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", beanFactory=" + beanFactory +
                ", beanName='" + beanName + '\'' +
                '}';
    }

    public void setPhone(int phone) {
        System.out.println("��ע�����ԡ�ע������phone");
        this.phone = phone;
    }

    /**
     * ���Խӿ�BeanFactoryAware
     *
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("��BeanFactoryAware�ӿڡ�����BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    /**
     * ���Խӿ�BeanNameAware
     *
     * @param beanName
     */
    @Override
    public void setBeanName(String beanName) {
        System.out.println("��BeanNameAware�ӿڡ�����BeanNameAware.setBeanName()");
        this.beanName = beanName;
    }

    /**
     * ���Խӿ� DisposableBean
     * ��Bean�������ڽ���ǰ����destory()������һЩ��β����
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("��DiposibleBean�ӿڡ�����DiposibleBean.destory()");
    }

    /**
     * ���Խӿ�InitializingBean
     * ����˼����Bean���Զ�������Ϻ����afterPropertiesSet()������һЩ��ʼ���Ĺ���
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("��InitializingBean�ӿڡ�����InitializingBean.afterPropertiesSet()");
    }

    // ͨ��<bean>��init-method����ָ���ĳ�ʼ������
    public void myInit() {
        System.out.println("��init-method������<bean>��init-method����ָ���ĳ�ʼ������");
    }

    // ͨ��<bean>��destroy-method����ָ���ĳ�ʼ������
    public void myDestory() {
        System.out.println("��destroy-method������<bean>��destroy-method����ָ���ĳ�ʼ������");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("��ApplicationContextAware�ӿڡ�����ApplicationContextAware.setApplicationContext()");
        this.applicationContext = applicationContext;
    }
}
