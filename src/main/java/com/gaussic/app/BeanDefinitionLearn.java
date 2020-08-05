package com.gaussic.app;

import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionLearn {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(Alisa.class);
        genericBeanDefinition.setScope("singleton");
        genericBeanDefinition.setAutowireMode(2);
        System.out.println(genericBeanDefinition.toString());
        ac.registerBeanDefinition("alisa", genericBeanDefinition);
        ac.refresh();
        System.out.println(ac.getBean("alisa"));
    }
}
