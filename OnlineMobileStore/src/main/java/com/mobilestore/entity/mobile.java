package com.mobilestore.entity;

import java.time.LocalDate;
import java.util.Locale.Category;

public class mobile {
	int mobileId;
	String name;
	float mobileCost;
    LocalDate mfd;
	String modelNumber;
	Category category;
	String companyName;
	public mobile(int mobileId, String name, float mobileCost, LocalDate mfd, String modelNumber, Category category,
			String companyName) {
		super();
		this.mobileId = mobileId;
		this.name = name;
		this.mobileCost = mobileCost;
		this.mfd = mfd;
		this.modelNumber = modelNumber;
		this.category = category;
		this.companyName = companyName;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMobileCost() {
		return mobileCost;
	}
	public void setMobileCost(float mobileCost) {
		this.mobileCost = mobileCost;
	}
	public LocalDate getMfd() {
		return mfd;
	}
	public void setMfd(LocalDate mfd) {
		this.mfd = mfd;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
public mobile () {
	super();
}
}