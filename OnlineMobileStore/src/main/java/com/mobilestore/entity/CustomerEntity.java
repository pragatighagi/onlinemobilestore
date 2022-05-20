package com.mobilestore.entity;

import com.mobilestore.model.User;

import lombok.Data;

@Data
public class CustomerEntity extends User {
	private int customerId;
	private String customerName;
	private String customerPassword;
	private long mobileNumber;
	private String email;
	
}

	
	