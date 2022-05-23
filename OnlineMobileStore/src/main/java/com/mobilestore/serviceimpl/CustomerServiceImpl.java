package com.mobilestore.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobilestore.dao.CategoryDao;
import com.mobilestore.entity.CustomerEntity;
import com.mobilestore.model.AppError;
import com.mobilestore.model.Customer;
import com.mobilestore.model.Response;
import com.mobilestore.service.CustomerService;

@Service
public abstract class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public Response<Customer> addCustomer(Customer customer) {
		Response<Customer> response = new Response<>();
		try {
			Customer.setCustomerId(0);
			CustomerEntity entity = CustomerTransformer.transformCustomer(customer);
			entity.setCategory(categoryDao.findById(customer.getCategory().getCategoryId()).orElse(null));
			entity = CustomerDao.save(entity);
			response.setData(CustomerTransformer.transformCustomerEntity(entity));
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_ADDING_CUSTOMER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Customer> updateCustomer(Customer customer) {
		Response<Customer> response = new Response<>();
		try {
			CustomerEntity entity = CustomerTransformer.transformCustomer(customer);
			entity.setCategory(categoryDao.findById(customer.getCategory().getCategoryId()).orElse(null));
			entity = CustomerDao.save(entity);
			response.setData(CustomerTransformer.transformCustomerEntity(entity));
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_UPDATING_CUSTOMER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<List<Customer>> getAllcustomers() {
		Response<List<customer>> response = new Response<>();
		try {
			List<CustomerEntity> entities = customerDao.findAll();
			List<Customer> customers = new ArrayList<Customer>();
			if (entities != null) {
				for (CustomerEntity entity : entities) {
					Customer.add(CustomerTransformer.transformCustomerEntity(entity));
				}
			}
			response.setData(customers);

		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_CUSTOMERS");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Customer> getCustomer(Integer customerId) {
		Response<Customer> response = new Response<>();
		try {
			Optional<CustomerEntity> opEntity = customerDao.findById(customerId);
			if (opEntity.isPresent()) {
				response.setData(CustomerTransformer.transformCustomerEntity(opEntity.get()));
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_CUSTOMER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	
	@Override
	public Response<Boolean> deleteCustomer(Integer customerId) {
		Response<Boolean> response = new Response<>();
		try {
			customerDao.deleteById(customerId);
			response.setData(true);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_CUSTOMER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

}
