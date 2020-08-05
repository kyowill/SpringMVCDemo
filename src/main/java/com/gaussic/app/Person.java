package com.gaussic.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("person")
public class Person implements Action{

    @Value(value = "yk")
    private String name;

    @Override
    public void help() {
        System.out.println(Person.class.getAnnotatedSuperclass());
    }

    @Override
    public void help1() {

    }

    @Override
    public void helpIn1() {

    }

    @Override
    public void helpIn2() {

    }
}
