package com.mobilestore.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mobileservice.transformer.UserTransformer;
import com.mobilestore.entity.UserEntity;
import com.mobilestore.model.AppError;
import com.mobilestore.model.Response;
import com.mobilestore.model.User;
import com.mobilestore.service.CategoryService;
import com.mobilestore.service.UserService;



public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao UserDao;

	@Override
	public Response<User> addUser(User User) {
		Response<User> response = new Response<>();
		try {
			UserEntity entity = User.setUserId(User.getUserId());
			if (entity != null) {
				AppError error = new AppError();
				error.setCode("ERR_ADD_User");
				error.setMessage("User already exists " + User.getUserId());
				response.setError(error);
			} else {
				User.setUserId(0);
				entity = UserTransformer.transformUser(User);
				User.save(entity);
				UserEntity newCate = UserTransformer.transformUserEntity(entity);
				response.setData(newCate);
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_ADD_USER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<User> updateUser(User user) {
		Response<User> response = new Response<>();
		try {
			UserEntity entity = UserTransformer.transformUser(user);

			UserDao.save(entity);

			UserEntity newCate = UserTransformer.transformUserEntity(entity);
			response.setData(newCate);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_UPDATING_USER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<List<User>> getAllUser() {
		Response<List<User>> response = new Response<>();
		try {
			List<UserEntity> entities = UserDao.findAll();
			List<User> categories = new ArrayList<>();
			if (entities != null) {
				for (UserEntity entity : entities) {
					User newCate = UserTransformer.transformUserEntity(entity);
					categories.add(newCate);
				}
			}
			response.setData(categories);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_USER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<User> getUser(Integer catId) {
		Response<User> response = new Response<>();
		try {
			Optional<UserEntity> opEntity = customerDao.findById(catId);

			if (opEntity.isPresent()) {
				UserEntity entity = opEntity.get();
				User newCate = UserTransformer.transformUserEntity(entity);
				response.setData(newCate);
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_User");
			error.setMessage("No User found for id " + catId);
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<User> getUserByName(String catName) {
		Response<User> response = new Response<>();
		try {
			UserEntity entity = UserDao.findByUserName(catName);
			if (entity != null) {
				User newCate = UserTransformer.transformUserEntity(entity);
				response.setData(newCate);
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_USER");
			error.setMessage("No User found with name " + catName);
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<User> addCategory(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<User> updateCategory(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<List<User>> getAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<User> getCategory(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<User> getCategoryByName(String userUserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<User> getCategoryByRole(String userRole) {
		// TODO Auto-generated method stub
		return null;
	}

}


