package in.knoldus.springbootMongoDB.DAO.impl;

import in.knoldus.springbootMongoDB.DAO.EmployeeDAO;
import in.knoldus.springbootMongoDB.model.Employee;
import in.knoldus.springbootMongoDB.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void saveEmployee(Employee topic) {
        employeeRepository.save(topic);
    }

    @Override
    public List<Employee> findAll() {
       return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getTopic(String id) {
        return employeeRepository.findById(id);
    }


}
