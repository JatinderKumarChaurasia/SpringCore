package com.cognizant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@Column(name = "CUSTOMER_ID")
	private int customerId;
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "CUSTOMER_PASSWORD")
	private String customerPassword;
	@Column(name = "CUSTOMER_GENDER")
	private String customerGender;
	@Column(name = "CUSTOMER_DOB")
	private String customerDOB;
	@Column(name = "CUSTOMER_CONTACTNO")
	private int customerContactno;
	@Column(name = "CUSTOMER_EMAILID")
	private String customerEmailId;

	public int getCustomerContactno() {
		return customerContactno;
	}

	public String getCustomerDOB() {
		return customerDOB;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerContactno(int customerContactno) {
		this.customerContactno = customerContactno;
	}

	public void setCustomerDOB(String customerDOB) {
		this.customerDOB = customerDOB;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

}
