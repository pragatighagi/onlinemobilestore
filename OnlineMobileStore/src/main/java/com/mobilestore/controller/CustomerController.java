package com.mobilestore.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.mobilestore.model.Customer;
import com.mobilestore.model.Response;
import com.mobilestore.service.CustomerService;

public class CustomerController {
	@Autowired
	private CustomerService customerService; 
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Customer> addCustomer(@RequestBody Customer customer){
		return ((CustomerController) customerService).addCustomer(customer);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Customer> updateCategory(@RequestBody Customer customer){
		return customerService.updateCustomer(customer);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<List<Customer>> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@GetMapping(value="/{catId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Customer> getCustomer(@PathVariable("catId") Integer catId){
		return customerService.getCustomer(catId);
	}

}


