package com.mobilestore.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileservice.transformer.CategoryTransformer;
import com.mobilestore.dao.CategoryDao;
import com.mobilestore.entity.CategoryEntity;
import com.mobilestore.model.AppError;
import com.mobilestore.model.Category;
import com.mobilestore.model.Response;
import com.mobilestore.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public Response<Category> addCategory(Category category) {
		Response<Category> response = new Response<>();
		try {
			CategoryEntity entity = categoryDao.findByCategoryName(category.getCategoryName());
			if (entity != null) {
				AppError error = new AppError();
				error.setCode("ERR_ADD_CATEGORY");
				error.setMessage("Category already exists " + category.getCategoryName());
				response.setError(error);
			} else {
				category.setCategoryId(0);
				entity = CategoryTransformer.transformCategory(category);
				categoryDao.save(entity);
				Category newCate = CategoryTransformer.transformCategoryEntity(entity);
				response.setData(newCate);
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_ADD_CATEGORY");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Category> updateCategory(Category category) {
		Response<Category> response = new Response<>();
		try {
			CategoryEntity entity = CategoryTransformer.transformCategory(category);

			categoryDao.save(entity);

			Category newCate = CategoryTransformer.transformCategoryEntity(entity);
			response.setData(newCate);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_UPDATING_CATEGORY");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<List<Category>> getAllCategory() {
		Response<List<Category>> response = new Response<>();
		try {
			List<CategoryEntity> entities = categoryDao.findAll();
			List<Category> categories = new ArrayList<>();
			if (entities != null) {
				for (CategoryEntity entity : entities) {
					Category newCate = CategoryTransformer.transformCategoryEntity(entity);
					categories.add(newCate);
				}
			}
			response.setData(categories);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_CATEGORIES");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Category> getCategory(Integer catId) {
		Response<Category> response = new Response<>();
		try {
			Optional<CategoryEntity> opEntity = categoryDao.findById(catId);

			if (opEntity.isPresent()) {
				CategoryEntity entity = opEntity.get();
				Category newCate = CategoryTransformer.transformCategoryEntity(entity);
				response.setData(newCate);
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_CATEGORY");
			error.setMessage("No Category found for id " + catId);
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Category> getCategoryByName(String catName) {
		Response<Category> response = new Response<>();
		try {
			CategoryEntity entity = categoryDao.findByCategoryName(catName);
			if (entity != null) {
				Category newCate = CategoryTransformer.transformCategoryEntity(entity);
				response.setData(newCate);
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_CATEGORY");
			error.setMessage("No Category found with name " + catName);
			response.setError(error);
		}
		return response;
	}

}
