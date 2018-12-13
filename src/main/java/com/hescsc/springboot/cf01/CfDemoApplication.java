package com.hescsc.springboot.cf01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class CfDemoApplication {

    public static void main(String... args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(CfDemoApplication.class, args);
    }
}



