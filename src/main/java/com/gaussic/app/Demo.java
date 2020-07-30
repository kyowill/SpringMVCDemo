package com.gaussic.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Demo {

    public static void main(String[] args) {
/*        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();*/
        System.out.println(System.getProperty("java.class.path"));//系统的classpaht路径
        System.out.println(System.getProperty("user.dir"));//用户的当前路径
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JiaJia jj = (JiaJia) ac.getBean("jiajia");
        jj.help();
    }
}
