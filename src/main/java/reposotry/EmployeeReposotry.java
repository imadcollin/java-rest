package reposotry;


import entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReposotry extends JpaRepository<Employee, Long> {

}

