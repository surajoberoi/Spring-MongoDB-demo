package in.knoldus.springbootMongoDB.DAO;

import in.knoldus.springbootMongoDB.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO {
    void saveEmployee(Employee topic);
    List<Employee> findAll();
    Optional<Employee> getTopic(String id);
}
