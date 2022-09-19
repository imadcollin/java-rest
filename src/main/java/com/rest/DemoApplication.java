package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)

public class DemoApplication {

        public static void main(String... args) {
            EmpolyeeController controller = new EmpolyeeController();
            SpringApplication.run(DemoApplication.class, args);
        }
    }
