package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemoBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args){

        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean bean=(BeanLifecycleDemoBean)context.getBean("beanlifecycledemo");
        System.out.println(bean);
        context.close();


    }
}
