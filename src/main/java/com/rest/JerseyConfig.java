package com.rest;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        register(EmpolyeeController.class);
        register(EmployeeReposotry.class);
    }
}