package com.gaussic.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alisa {

    @Autowired
    JiaJia jia;

    public void help(){
        System.out.println("alisa");
    }
}
