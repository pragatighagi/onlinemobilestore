package com.mobilestore.model;

import java.util.Date;

import lombok.Data;

@Data
public class Order {;
	private Date orderDate;
	private Date DispatchDate;
	private int quantity;
	private int cost;
	private int totalcost;
	private  Customer customer;
	private String status;
	

}
