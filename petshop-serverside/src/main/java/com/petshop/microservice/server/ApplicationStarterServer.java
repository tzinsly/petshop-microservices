package com.petshop.microservice.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ApplicationStarterServer {

    public static void main (String[] args){
        SpringApplication.run(ApplicationStarterServer.class, args);
    }
}
