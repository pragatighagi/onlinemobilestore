package com.mobilestore.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilestore.entity.CategoryEntity;

	@Repository
	public interface CategoryDao extends JpaRepository<CategoryEntity, Integer> {
		CategoryEntity findByCategoryName(String categoryName);

		List<CategoryEntity> findAll();

		Optional<CategoryEntity> findById(Integer catId);

		void Save(CategoryEntity entity);
	}
	
	
	



