package com.gaussic.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Scope("prototype")
@Component
public class YK {

    @Autowired
    private Map<Integer, String> candidate;

    public YK(){
        System.out.println("yk");
    }

    @BNN
    public void help(){
        System.out.println("yk");
    }
}
