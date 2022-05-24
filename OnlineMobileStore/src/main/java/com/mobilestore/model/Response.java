package com.mobilestore.model;

import java.util.Collection;
import java.util.List;

import com.mobilestore.entity.CartEntity;
import com.mobilestore.entity.UserEntity;

import lombok.Data;

@Data
public class Response<T> {
	private T data;
	private String status;
	private AppError error;

	public String getStatus() {
		return error != null ? "ERROR" : "SUCCESS";
	}

	public void setData1(CartEntity newCate) {
		// TODO Auto-generated method stub
		
	}

	public void setData(List<Mobile> mobiles) {
		// TODO Auto-generated method stub
		
	}

	public void setData(CartEntity newCate) {
		// TODO Auto-generated method stub
		
	}

	public void setData(Mobile transformMobileEntity) {
		// TODO Auto-generated method stub
		
	}

	public void setData(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setData(User newUser) {
		// TODO Auto-generated method stub
		
	}

	public void setData(UserEntity newUser) {
		// TODO Auto-generated method stub
		
	}

}
