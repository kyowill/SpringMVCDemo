package com.gaussic.app;

import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.getPropertyValues().add("name", "yy");
        rootBeanDefinition.setAbstract(true);
        //rootBeanDefinition.setBeanClass(BeanService.class);实例化时


        ChildBeanDefinition childBeanDefinition = new ChildBeanDefinition("bs");
        childBeanDefinition.setBeanClass(YK.class);

        ac.registerBeanDefinition("bs", rootBeanDefinition);
        ac.registerBeanDefinition("yk", childBeanDefinition);

        ac.refresh();
    }
}
