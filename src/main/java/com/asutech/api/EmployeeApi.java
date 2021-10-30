package com.asutech.api;

import com.asutech.dao.model.EmployeeDto;
import com.asutech.dao.repository.DepartmentRepository;
import com.asutech.entity.Department;
import com.asutech.entity.Employee;
import com.asutech.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {
    @Autowired
    EmploymentService employmentService;
    @Autowired
    private DepartmentRepository departmentRepository;
    @PostConstruct
    public void init(){
        Employee employee =new Employee();
        employee.setEname("John");
        employee.setEmpno("8365");
        employee.setJobName("Engineer");
        employee.setManagerName("Dean");
        Department department = departmentRepository.findById("1").orElse(new Department());
        employee.setDepartment(department);
        employee.setSalary(3500.85D);
        employmentService.addEmployee(employee);
    }

    @PostMapping
    public ResponseEntity<Void> addEmployee(@RequestBody Employee employee){
        employmentService.addEmployee(employee.getEname(), employee.getJobName(), employee.getManagerName(),
                employee.getSalary());
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Map> getAllEmployee(){
        Map<String, List<EmployeeDto>> responseMap = Collections.singletonMap("employees",
                employmentService.getAllEmployees());

        return new ResponseEntity<Map>(responseMap, HttpStatus.OK);
    }

}
