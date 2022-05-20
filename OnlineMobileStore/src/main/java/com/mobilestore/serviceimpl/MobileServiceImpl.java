package com.mobilestore.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.CategoryDao;
import com.capgemini.dao.MobileDao;
import com.capgemini.entity.MobileEntity;
import com.capgemini.model.AppError;
import com.capgemini.model.Mobile;
import com.capgemini.model.Response;
import com.capgemini.service.MobileService;
import com.capgemini.service.transformer.MobileTransformer;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileDao mobileDao;

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public Response<Mobile> addMobile(Mobile mobile) {
		Response<Mobile> response = new Response<>();
		try {
			mobile.setMobileId(0);
			MobileEntity entity = MobileTransformer.transformMobile(mobile);
			entity.setCategory(categoryDao.findById(mobile.getCategory().getCategoryId()).orElse(null));
			entity = mobileDao.save(entity);
			response.setData(MobileTransformer.transformMobileEntity(entity));
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_ADDING_MOBILE");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Mobile> updateMobile(Mobile mobile) {
		Response<Mobile> response = new Response<>();
		try {
			MobileEntity entity = MobileTransformer.transformMobile(mobile);
			entity.setCategory(categoryDao.findById(mobile.getCategory().getCategoryId()).orElse(null));
			entity = mobileDao.save(entity);
			response.setData(MobileTransformer.transformMobileEntity(entity));
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_UPDATING_MOBILE");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<List<Mobile>> getAllMobiles() {
		Response<List<Mobile>> response = new Response<>();
		try {
			List<MobileEntity> entities = mobileDao.findAll();
			List<Mobile> mobiles = new ArrayList<Mobile>();
			if (entities != null) {
				for (MobileEntity entity : entities) {
					mobiles.add(MobileTransformer.transformMobileEntity(entity));
				}
			}
			response.setData(mobiles);

		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_MOBILES");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Mobile> getMobile(Integer mobId) {
		Response<Mobile> response = new Response<>();
		try {
			Optional<MobileEntity> opEntity = mobileDao.findById(mobId);
			if (opEntity.isPresent()) {
				response.setData(MobileTransformer.transformMobileEntity(opEntity.get()));
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_MOBILE");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<List<Mobile>> getMobileByCompany(String companyName) {
		Response<List<Mobile>> response = new Response<>();
		try {
			List<MobileEntity> entities = mobileDao.findAllByCompanyName(companyName);
			List<Mobile> mobiles = new ArrayList<Mobile>();
			if (entities != null) {
				for (MobileEntity entity : entities) {
					mobiles.add(MobileTransformer.transformMobileEntity(entity));
				}
			}
			response.setData(mobiles);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_MOBILES");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Boolean> deleteMobile(Integer mobId) {
		Response<Boolean> response = new Response<>();
		try {
			mobileDao.deleteById(mobId);
			response.setData(true);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_MOBILE");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

}
