package in.knoldus.springbootMongoDB.controller;

import in.knoldus.springbootMongoDB.DTO.ResponseDTO;
import in.knoldus.springbootMongoDB.DTO.EmployeeRequestDTO;
import in.knoldus.springbootMongoDB.model.Employee;
import in.knoldus.springbootMongoDB.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

/*    @GetMapping("/getTopics")
    public List<Employee> getAllTopics() {
        return employeeServiceImpl.getAllTopics();
    }

    @GetMapping("/getSingleTopic/{id}")
    public Optional<Employee> getSingleTopic(@PathVariable String id) {
        return employeeServiceImpl.getSingleTopic(id);
    }*/

    @PostMapping("/saveTopic")
    public ResponseDTO saveTopic(@Valid @RequestBody EmployeeRequestDTO topic) {
       return employeeServiceImpl.saveEmployee(topic);

    }
}


