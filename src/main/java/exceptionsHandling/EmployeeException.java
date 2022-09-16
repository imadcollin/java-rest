package exceptionsHandling;

public class EmployeeException extends RuntimeException {

    public EmployeeException(Long id) {
        super("Could not find employee " + id);
    }
}

