package com.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpCtrl {
        @RequestMapping("/")
        public List<Employee> getEmployees()
        {
            List<Employee> employeesList = new ArrayList<Employee>();
            employeesList.add(new Employee("terst", "ttestest"));
            return employeesList;
        }
}
