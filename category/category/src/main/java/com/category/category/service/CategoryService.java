package com.category.category.service;

import com.category.category.entuti.Category;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CategoryService {

    Category addCategory(Category categoryDto);

    List<Category> saveCategory(List<Category>categories );

    List<Category> getAllcategorys();


    Category updatecategory(Category updateCategory, Integer id);

    Category categoryByID(int categoryId);

    String deleteByID(String cartId);
}
