package com.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadData {
    private static final Logger log = LoggerFactory.getLogger(LoadData.class);


    @Bean
    CommandLineRunner initDatabase(EmployeeReposotry repository) {
        log.info("loading data .... ");
        return args -> {
            repository.save(new Employee("Bilbo Baggins", "burglar", "Musical"));
            repository.save(new Employee("Frodo Baggins", "thief", "Solider"));
        };
    }
}