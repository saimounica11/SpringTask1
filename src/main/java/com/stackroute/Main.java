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
        Movie movie=context.getBean("movie", Movie.class);
        movie.display();

        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie m=(Movie)context.getBean("movie");
        m.display();




    }
}
