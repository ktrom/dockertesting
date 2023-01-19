package com.example.dockerfun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerFunApplication {

    public static void main(String[] args) {
        System.out.println("testrun");
        SpringApplication.run(DockerFunApplication.class, args);
    }

}
