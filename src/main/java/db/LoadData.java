package db;

import entities.Employee;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import controller.EmployeeReposotry;

import java.util.logging.Logger;

@Configuration
public class LoadData {

    private static final Logger log = (Logger) LoggerFactory.getLogger(LoadData.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeReposotry repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}