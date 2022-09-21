package com.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

public class DemoApplication implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    private EmployeeReposotry reposotry;

    public static void main(String... args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Running....");
        LoadData loadData = new LoadData();
        loadData.initDatabase(reposotry);
    }
}

