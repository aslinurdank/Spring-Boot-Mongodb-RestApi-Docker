package com.asutech.service;


import com.asutech.dao.model.EmployeeDto;
import com.asutech.dao.repository.DepartmentRepository;
import com.asutech.dao.repository.EmployeeRepository;
import com.asutech.entity.Department;
import com.asutech.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmploymentServiceImpl implements EmploymentService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<EmployeeDto> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();

		List<EmployeeDto> employeeDtos = employees.stream().map(p -> new EmployeeDto(p)).collect(Collectors.toList());

		return employeeDtos;
	}

	public void addEmployee(String ename, String jobName, String managerName, double salary) {
		

	}

	@Override
	public void addEmployee(Employee employee) {
		Department department = departmentRepository.findById("1").orElse(new Department());

		Employee newEmployee = new Employee();
		newEmployee.setEname(employee.getEname());
		newEmployee.setDepartment(department);
		newEmployee.setJobName(employee.getJobName());
		newEmployee.setManagerName(employee.getManagerName());
		newEmployee.setSalary(employee.getSalary());
		employeeRepository.save(newEmployee);
	}

	public void updateEmployee(String depno, String empno, Employee employee) {
		Employee currentEmployee = employeeRepository.findById(empno).orElse(new Employee());

		currentEmployee.setEname(employee.getEname());
		currentEmployee.setJobName(employee.getJobName());
		currentEmployee.setManagerName(employee.getManagerName());
		currentEmployee.setSalary(employee.getSalary());
		employeeRepository.save(currentEmployee);
	}
}
