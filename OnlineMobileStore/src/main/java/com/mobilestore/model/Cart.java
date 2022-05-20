package com.mobilestore.model;


	

import lombok.Data;



	@Data
	public class Cart{
	private int cartId;
	private Customer customer;
	private int quantity;
	private int cost;
    private mobile List<mobile> ;

}
