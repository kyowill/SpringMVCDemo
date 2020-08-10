package com.gaussic.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Demo {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AppService app = (AppService) ac.getBean("appService");
        System.out.println(ac.getBean(AppService.class));
        //System.out.println(ac.getBean(MaMa.class));
//        JiaJia jiaJia = new JiaJia();
//        jiaJia.help();
    }
}
