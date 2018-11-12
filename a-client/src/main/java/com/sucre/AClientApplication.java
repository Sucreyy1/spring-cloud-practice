package com.sucre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(AClientApplication.class);
    }
}
