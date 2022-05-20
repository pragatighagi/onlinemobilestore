package com.mobilestore.model;

import java.util.Date;

import lombok.Data;

@Data
public class Mobile {
	private int mobileId;
	private String mobileName;
	private float mobileCost;
	private Date mfd;
	private String modelNumber;
	private String companyName;
	private Category category;
	
}
