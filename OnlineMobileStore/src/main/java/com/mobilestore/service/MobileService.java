package com.mobilestore.service;

import java.util.List;

import com.capgemini.model.Mobile;
import com.capgemini.model.Response;

public interface MobileService {
		
	public Response<Mobile> addMobile(Mobile mobile);
	public Response<Mobile> updateMobile(Mobile mobile);
	public Response<List<Mobile>> getAllMobiles();
	public Response<Mobile> getMobile(Integer mobId);
	public Response<List<Mobile>> getMobileByCompany(String companyName);
	public Response<Boolean> deleteMobile(Integer mobId);
}
