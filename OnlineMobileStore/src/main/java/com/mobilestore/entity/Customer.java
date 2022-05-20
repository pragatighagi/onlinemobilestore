package com.mobilestore.entity;

import lombok.Data;

@Data
public class Customer extends User {
	private int customerId;
	private String customerName;
	private String customerPassword;
	private long mobileNumber;
	private String email;
	
}
