package com.mobileservice.transformer;
import com.mobilestore.entity.UserEntity;
import com.mobilestore.model.User;

public class UserTransformer {

		public static com.mobilestore.entity.UserEntity transformUser(com.mobilestore.entity.UserEntity user) {
			if (user != null) {
				UserEntity entity = new com.mobilestore.entity.UserEntity();
				entity.setUserId(user.getUserId());
				entity.setUsername(user.getUsername());
				entity.setRole(user.getRole());
				
				return entity;
			}
			return null;
		}

		public static UserEntity transformUserEntity(com.mobilestore.entity.UserEntity entity) {
			if (entity != null) {
				com.mobilestore.entity.UserEntity newUser = new com.mobilestore.entity.UserEntity();
				newUser.setUserId(entity.getUserId());
				newUser.setUsername(entity.getUsername());
				newUser.setRole(entity.getRole());
				
				
				return newUser;
			}
			return null;
		}
		public static UserEntity transformCustomer(User customer) {
			// TODO Auto-generated method stub
			return null;
		}
	}




