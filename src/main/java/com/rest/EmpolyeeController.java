package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class EmpolyeeController {
    @Autowired
    private EmployeeReposotry repository;
    private static EmpolyeeController instance;

    public void setRepo(EmployeeReposotry repository) {

        this.repository = repository;
    }

    public EmpolyeeController() {
    }

    public static EmpolyeeController getInstance() {
        if (instance == null) {
            return new EmpolyeeController();
        }
        return instance;
    }

    @GetMapping("/")
    public String home() {
        return "Home Page";
    }

    @GetMapping("/about")
    public String about() {
        return "About Us Page";
    }

    @GetMapping("/employees")
    CollectionModel<EntityModel<Employee>> all() {

        List<EntityModel<Employee>> employees = repository.findAll().stream()
                .map(employee -> EntityModel.of(employee,
                        linkTo(methodOn(EmpolyeeController.class).one(employee.getId())).withSelfRel(),
                        linkTo(methodOn(EmpolyeeController.class).all()).withRel("employees")))
                .collect(Collectors.toList());

        return CollectionModel.of(employees, linkTo(methodOn(EmpolyeeController.class).all()).withSelfRel());
    }
/*

    @PostMapping("/employees")
    Employee newEmployee(@RequestParam Employee newEmployee) {
        System.out.println(newEmployee.getId());

        return repository.save(newEmployee);
    }
 */

    // Single item

    /*
    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeException(id));
    }
     */

    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    @GetMapping("/employees/{id}")
    EntityModel<Employee> one(@PathVariable Long id) {

        Employee employee = repository.findById(id)
                .orElseThrow(() -> new EmployeeException(id));

        return EntityModel.of(employee,
                linkTo(methodOn(EmpolyeeController.class).one(id)).withSelfRel(),
                linkTo(methodOn(EmpolyeeController.class).all()).withRel("employees"));
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}