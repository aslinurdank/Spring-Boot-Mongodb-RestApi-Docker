package com.asutech.entity;

import org.springframework.data.annotation.Id;


public class Department {

	@Id
	private String depno;
	private String depname;
	private String deploc;


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
