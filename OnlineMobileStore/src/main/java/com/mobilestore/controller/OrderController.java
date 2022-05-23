package com.mobilestore.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.mobilestore.model.Order;
import com.mobilestore.model.Response;
import com.mobilestore.service.OrderService;
public class OrderController {
	@Autowired
	private OrderService orderService; 
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Order> addOrder(@RequestBody Order order){
		return ((OrderService) orderService).addOrder(order);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Order> updateOrder(@RequestBody Order order){
		return orderService.updateOrder(order);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<List<Order>> getAllOrder(){
		return orderService.getAllOrder();
	}
	
	@GetMapping(value="/{catId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Order> getCategory(@PathVariable("catId") Integer catId){
		return orderService.getOrder(catId);
	}

}

