package com.rest;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee employee) {

        return EntityModel.of(employee, //
                linkTo(methodOn(EmpolyeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmpolyeeController.class).all()).withRel("employees"));
    }
}

