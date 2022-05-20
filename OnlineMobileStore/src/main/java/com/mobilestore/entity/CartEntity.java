package com.mobilestore.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "cart")
public class CartEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cartId")
	private int cartId;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "cost")
	private int cost;

	@OneToMany(mappedBy = "cart")
	private List<MobileEntity> mobile;
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private CustomerEntity customer;


}
