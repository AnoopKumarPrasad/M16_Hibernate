package com.tns.inheritance3;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Manager3")
public class Manager extends Employee {
	private static final long serialVersionUID=1L;
	private String deptName;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}