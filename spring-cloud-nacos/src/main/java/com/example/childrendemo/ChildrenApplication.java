package com.example.childrendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ChildrenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChildrenApplication.class, args);
    }

}
