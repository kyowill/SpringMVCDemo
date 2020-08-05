package com.gaussic.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.gaussic.app")
public class AppConfig {

    @Bean
    public Alisa getAlisa(){
        return new Alisa();
    }
}
