package com.gaussic.app;

import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext();
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.getPropertyValues().add("xxx", "yy");
        rootBeanDefinition.setAbstract(true);

        ChildBeanDefinition childBeanDefinition = new ChildBeanDefinition("rbd");
        childBeanDefinition.setBeanClass(YK.class);

    }
}
