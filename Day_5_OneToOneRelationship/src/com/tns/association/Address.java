package com.tns.association;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "address")
public class Address implements Serializable {
	
	
	private static final long serialVersionUID =1L;
	
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID")
	private int addressId;
	
	@Column(name ="Line_1")
	private String addressLine1;
	
	@Column(name ="Line_2")
	private String addressLine2;
	
	@Column(name ="Pincode")
	private double pincode;
	
	@Column(name ="State")
	private String state;
	
	//comment this two line in step 1
	//@OneToOne(mappedBy="address")
	//private Employee employee;
	
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "Employee_ID")
	//private Employee employeeId;
	
	public Address() {
		
	}

	public Address(String addressLine1, String addressLine2, double pincode, String state) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pincode = pincode;
		this.state = state;
		//this.employeeId = employeeId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public double getPincode() {
		return pincode;
	}

	public void setPincode(double pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	/*public Employee getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", pincode=" + pincode + ", state=" + state + "]";
	}*/
	
}