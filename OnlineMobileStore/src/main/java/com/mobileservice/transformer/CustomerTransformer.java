package com.mobileservice.transformer;
import com.mobilestore.entity.CustomerEntity;
import com.mobilestore.model.Customer;

public class CustomerTransformer{
	public static com.mobilestore.entity.CustomerEntity transformCustomer(com.mobilestore.entity.CustomerEntity customer) {
		if (customer != null) {
			CustomerEntity entity = new com.mobilestore.entity.CustomerEntity();
			entity.setCustomerId(customer.getCustomerId());
			entity.setCustomerPassword(customer.getCustomerPassword());
			entity.setCustomerName(customer.getCustomerName());
			entity.setMobileNumber(customer.getMobileNumber());
			entity.setEmail(customer.getEmail());
			
			return entity;
		}
		return null;
	}

	public static CustomerEntity transformCustomerEntity(com.mobilestore.entity.CustomerEntity entity) {
		if (entity != null) {
			com.mobilestore.entity.CustomerEntity newCust = new com.mobilestore.entity.CustomerEntity();
			newCust.setCustomerId(entity.getCustomerId());
			newCust.setCustomerName(entity.getCustomerName());
			newCust.setCustomerPassword(entity.getCustomerPassword());
			newCust.setMobileNumber(entity.getMobileNumber());
			newCust.setEmail(entity.getEmail());
			
			return newCust;
		}
		return null;
	}
	public static CustomerEntity transformCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
}





