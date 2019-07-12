package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args){

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("movie1", Movie.class);
        String s1=movie1.toString();
        Movie movie2=context.getBean("movie2", Movie.class);
        String s2=movie2.toString();
        System.out.println(s1);
        System.out.println(s2);

    }
}
