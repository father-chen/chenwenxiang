package com.qdc.demoeurekaprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

//@EnableResourceServer
@EnableEurekaClient
@SpringBootApplication
public class DemoEurekaProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaProvider1Application.class, args);
    }

}
