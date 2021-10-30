package com.asutech.service;

import com.asutech.dao.model.EmployeeDto;
import com.asutech.entity.Employee;

import java.util.List;

public interface EmploymentService {
	public List<EmployeeDto> getAllEmployees();
	public void addEmployee(Employee employee);
	public void updateEmployee(String depno, String empno, Employee employee);
}
