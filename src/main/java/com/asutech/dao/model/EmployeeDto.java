package com.asutech.dao.model;


import com.asutech.entity.Employee;

public class EmployeeDto {

	private String empno;

	private String ename;
	private String jobName;
	private String managerName;
	private Double salary;
	private DepartmentDto department;
	
	public EmployeeDto(Employee p) {
		empno = p.getEmpno();
		ename = p.getEname();
		jobName = p.getJobName();
		managerName = p.getManagerName();

		if (p.getDepartment() != null) {
			department = new DepartmentDto(p.getDepartment().getDepno(), p.getDepartment().getDepname(),
					p.getDepartment().getDeploc());
		}
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	  
	  
}
