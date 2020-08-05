package com.gaussic.app;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Demo2.class.getClassLoader());
        System.out.println(Demo1.class.getClassLoader());
        Class<?>[] clasz = new Class<?>[]{Action.class};
        Action ac = (Action) Proxy.newProxyInstance(Demo2.class.getClassLoader(), clasz, new InvocationHandler(){

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName());
                return null;
            }
        });
        ac.help1();
        ac.help();
    }
}
