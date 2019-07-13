package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    public void customInit(){
        System.out.println("Initialization");
    }
    public void customDestroy(){
        System.out.println("Destroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroying the bean");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Intializing the bean");
    }
}
