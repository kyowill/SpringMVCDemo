package com.gaussic.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JiaJia implements Action{

    @Autowired
    Alisa alisa;

//    JiaJia(String name){
//
//    }

    JiaJia(){
        alisa = new Alisa();
        System.out.println(alisa);
    }

    @Override
    public void help(){
        System.out.println("jiajia");
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
