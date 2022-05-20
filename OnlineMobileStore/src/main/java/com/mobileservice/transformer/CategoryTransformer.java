package com.mobileservice.transformer;

import com.mobilestore.entity.CategoryEntity;
import com.mobilestore.model.Category;

public class CategoryTransformer {
	public static com.mobilestore.entity.CategoryEntity transformCategory(com.mobilestore.entity.CategoryEntity category) {
		if (category != null) {
			com.mobilestore.entity.CategoryEntity entity = new com.mobilestore.entity.CategoryEntity();
			entity.setCategoryId(category.getCategoryId());
			entity.setCategoryName(category.getCategoryName());
			return entity;
		}
		return null;
	}

	public static com.mobilestore.entity.CategoryEntity transformCategoryEntity(com.mobilestore.entity.CategoryEntity entity) {
		if (entity != null) {
			com.mobilestore.entity.CategoryEntity newCate = new com.mobilestore.entity.CategoryEntity();
			newCate.setCategoryId(entity.getCategoryId());
			newCate.setCategoryName(entity.getCategoryName());
			return newCate;
		}
		return null;

	}

	public static CategoryEntity transformCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

}
