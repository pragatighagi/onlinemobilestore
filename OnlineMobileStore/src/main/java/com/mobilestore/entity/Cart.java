package com.mobilestore.entity;
import java.util.*;
public class Cart {
int cartID;
Customer customer;
List<mobile> mobile;
int quantity;
int cost;
public Cart(int cartID, Customer customer, List<com.mobilestore.entity.mobile> mobile, int quantity, int cost) {
	super();
	this.cartID = cartID;
	this.customer = customer;
	this.mobile = mobile;
	this.quantity = quantity;
	this.cost = cost;
}
public int getCartID() {
	return cartID;
}
public void setCartID(int cartID) {
	this.cartID = cartID;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public List<mobile> getMobile() {
	return mobile;
}
public void setMobile(List<mobile> mobile) {
	this.mobile = mobile;
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

}