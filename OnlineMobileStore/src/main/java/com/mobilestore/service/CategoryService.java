package com.mobilestore.service;

	/*import java.util.List;

	import com.mobileapp.entity.Category;
import com.mobileapp.entity.Customer;
import com.mobileapp.exception.CategoryNotFoundException;

	public interface CategoryService {

		public Category addCategory(String categoryName);
		public Category updateCategoryName(String categoryName) throws CategoryNameNotFoundException;
		public Category cancelCategoryId(Integer categoryid) throws CategoryIdNotFoundException;
		public List<Category> showAllCustomers(int cid);
	}
*/
import java.util.List;

import com.mobilestore.entity.Category;

public interface CategoryService {

    String saveCategory(Category category);

    List<Category> findAllCategories();

    Category findCategoryById(Integer id);

    String deleteCategory(Integer id);

    String updateCategory(Category branch);

}