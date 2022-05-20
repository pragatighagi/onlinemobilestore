package com.mobileservice.transformer;

import com.capgemini.entity.MobileEntity;
import com.mobilestore.model.Mobile;

public class MobileTransformer {
	public static MobileEntity transformMobile(Mobile mobile) {
		if(mobile != null) {
			MobileEntity entity = new MobileEntity();
			entity.setMobileId(mobile.getMobileId());
			entity.setMobileName(mobile.getMobileName());
			entity.setModelNumber(mobile.getModelNumber());
			entity.setMobileCost(mobile.getMobileCost());
			entity.setMfd(mobile.getMfd());
			entity.setCompanyName(mobile.getCompanyName());
			entity.setCategory(CategoryTransformer.transformCategory(mobile.getCategory()));
			return entity;
		}
		return null;
	}
	
	
	public static Mobile transformMobileEntity(MobileEntity entity) {
		if(entity != null) {
			Mobile mobile = new Mobile();
			mobile.setMobileId(entity.getMobileId());
			mobile.setMobileName(entity.getMobileName());
			mobile.setModelNumber(entity.getModelNumber());
			mobile.setMobileCost(entity.getMobileCost());
			mobile.setMfd(entity.getMfd());
			mobile.setCompanyName(entity.getCompanyName());
			mobile.setCategory(CategoryTransformer.transformCategoryEntity(entity.getCategory()));
			return mobile;
		}
		return null;
	}
}
