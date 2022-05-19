package com.mobilestore.service;

import java.util.List;

import com.mobilestore.entity.Category;

public interface CategoryService {

    String saveCategory(Category category);

    List<Category> findAllCategories();

    Category findCategoryById(Integer id);

    String deleteCategory(Integer id);

    String updateCategory(Category name);

	Category addCatogry(Category category);

	Category addCatogry1(Category category);

	

}