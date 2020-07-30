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
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        JiaJia jj = (JiaJia) ac.getBean("jiajia");
        jj.help();
    }
}
