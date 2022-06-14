package com.cg.entities;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class Admin {
	
	private int id;
	private String name;
	private String password; //private for password
	
	//private User dao;
	
	//getter and setter method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password; 
	}
}

