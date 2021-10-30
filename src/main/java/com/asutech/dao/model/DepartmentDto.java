package com.asutech.dao.model;

public class DepartmentDto {

	private String depno;
	private String depname;
	private String deploc;

	public DepartmentDto(String depno, String depname, String deploc) {
		super();
		this.depno = depno;
		this.depname = depname;
		this.deploc = deploc;
	}
	
	public String getDepno() {
		return depno;
	}

	public void setDepno(String depno) {
		this.depno = depno;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public String getDeploc() {
		return deploc;
	}

	public void setDeploc(String deploc) {
		this.deploc = deploc;
	}

}
