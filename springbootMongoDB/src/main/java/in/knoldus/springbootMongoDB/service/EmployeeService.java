package in.knoldus.springbootMongoDB.service;

import in.knoldus.springbootMongoDB.DTO.ResponseDTO;
import in.knoldus.springbootMongoDB.DTO.EmployeeRequestDTO;

public interface EmployeeService {

    ResponseDTO saveEmployee(EmployeeRequestDTO topicRequestDTO);
    //ResponseDTO findAllTopics();
}
