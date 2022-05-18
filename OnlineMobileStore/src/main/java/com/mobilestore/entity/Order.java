package com.mobilestore.entity;
import java.time.LocalDate;
public class Order {


	 LocalDate orderDate;
	 LocalDate dispatchDate;
	 int quantity;
	 int cost;
	 int totalcost;
	 Customer customer;
	 String status;
	 
	 public void order() {

	 }
	public void order(LocalDate orderDate, LocalDate dispatchDate, int quantity, int cost, int totalcaost,
			Customer customer, String status) {
		
		this.orderDate = orderDate;
		this.dispatchDate = dispatchDate;
		this.quantity = quantity;
		this.cost = cost;
		this.totalcost = totalcaost;
		this.customer = customer;
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(LocalDate dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTotalcaost() {
		return totalcost;
	}
	public void setTotalcaost(int totalcaost) {
		this.totalcost = totalcaost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	 
	 

}
