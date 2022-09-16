package controller;


import entities.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeReposotry extends JpaRepository<Employee, Long> {

}

