package com.mobilestore.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Data;

@Data
@Entity
@Table(name = "order")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int quantity;
	private int cost;
	private String status;
	private int totalcost;

	@Temporal(TemporalType.DATE)
	private Date orderDate;
	private Date dispatchDate;
	

	@ManyToOne
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private CustomerEntity customer;

}



