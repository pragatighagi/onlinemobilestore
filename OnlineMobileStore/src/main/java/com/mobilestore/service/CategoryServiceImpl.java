package com.mobilestore.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobilestore.entity.Category;
import com.mobilestore.repository.CategoryRepository;

import java.util.List;

public class CategoryServiceImpl {

    CategoryRepository CategoryRepository;



  
    public List<Category> findAll() {
        List<Category> res = CategoryRepository.findAllByOrderByCategoryType();
      //  res.sort(Comparator.comparing(Category::getCategoryType));
        return res;
    }

    public Category findByCategoryType(Integer categoryType) {
        CategoryServiceImpl CategoryRepository;
		Category res = CategoryRepository.findByCategoryType(categoryType);
        if(res == null) throw new MyException(ResultEnum.CATEGORY_NOT_FOUND);
        return res;
    }

    public List<Category> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        List<Category> res = CategoryRepository.findByCategoryTypeInOrderByCategoryTypeAsc(categoryTypeList);
       //res.sort(Comparator.comparing(ProductCategory::getCategoryType));
        return res;
    }

    public Category save(Category Category) {
        return CategoryRepository.save(Category);
    }



}

}
