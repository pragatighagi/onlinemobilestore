package com.mobilestore.entity;

public class Customer {
	
	private int customerId;
	
	private String customerName;
	private String customerPassword;
	private Long mobileNumber;
	private String emailId;
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, String customerPassword, Long mobileNumber, String emailId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}

