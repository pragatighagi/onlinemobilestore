package com.mobilestore.model;

import java.util.Date;

import com.mobilestore.entity.CategoryEntity;

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
	public void setCategory(CategoryEntity transformCategoryEntity) {
		// TODO Auto-generated method stub
		
	}
	
}
