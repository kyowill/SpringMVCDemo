package com.gaussic.app;

import org.springframework.stereotype.Service;

@Service("appService")
public class AppService {
    public AppService(BeanService beanService){
        //System.out.println(beanService);
    }
}
