package com.gaussic.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo4 {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(ac.getBean(JiaJia.class));
        //System.out.println("------");
        //System.out.println(ac.getBean(Alisa.class));
    }
}
