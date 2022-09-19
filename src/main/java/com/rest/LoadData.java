package com.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadData {


    @Bean
    CommandLineRunner initDatabase(EmployeeReposotry repository) {

        return args -> {
             repository.save(new Employee("Bilbo Baggins", "burglar"));
            repository.save(new Employee("Frodo Baggins", "thief"));
        };
    }
}