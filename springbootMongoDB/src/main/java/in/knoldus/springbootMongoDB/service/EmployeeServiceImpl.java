package in.knoldus.springbootMongoDB.service;

import in.knoldus.springbootMongoDB.DAO.EmployeeDAO;
import in.knoldus.springbootMongoDB.DTO.ResponseDTO;
import in.knoldus.springbootMongoDB.DTO.EmployeeRequestDTO;
import in.knoldus.springbootMongoDB.model.Employee;
import in.knoldus.springbootMongoDB.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeDAO employeeDAO;

/*    public List<Employee> getAllTopics() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getSingleTopic(@PathVariable String id) {
        return employeeRepository.findById(id);
    }*/

    @Override
    public ResponseDTO saveEmployee(EmployeeRequestDTO employeeRequestDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Request failed");
        responseDTO.setStatus(false);

        if(Objects.nonNull(employeeRequestDTO.getId())) {
        }
        else{
            Employee employee = Employee.builder()
                    .email(employeeRequestDTO.getEmail())
                    .dept(employeeRequestDTO.getDept())
                    .name(employeeRequestDTO.getName())
                    .registrationId(UUID.randomUUID())
                    .build();

            employeeDAO.saveEmployee(employee);


            responseDTO.setMessage("Employee Object created successfully with id: " + employee.getRegistrationId());
            responseDTO.setStatus(true);
            responseDTO.setData(employee);

        }
        return responseDTO;
    }

/*    @Override
    public ResponseDTO findAllTopics() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Request failed");
        responseDTO.setStatus(false);

        List<Employee> topics = employeeDAO.findAll();

        responseDTO.setMessage("Topics fetched successfully");
        responseDTO.setStatus(true);
        responseDTO.setData(topics);

        return responseDTO;
    }*/

/*    public String saveTopic(@RequestBody TopicDTO topicDTO) {
        topicRepository.save(topicDTO);
        return "Topic added with : " + topicDTO.getId();
    }*/

}