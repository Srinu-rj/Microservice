package com.category.category.serviceImpl;


import com.category.category.entuti.Category;
import com.category.category.repo.CategoryRepo;
import com.category.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public Category addCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public List<Category> saveCategory(List<Category> categories) {

        return categoryRepo.saveAll(categories);
    }

    @Override
    public List<Category> getAllcategorys() {
        return categoryRepo.findAll();
    }

    @Override
    public String deleteCategoryById(Integer categoryId) {
        categoryRepo.findById(categoryId);
        return "categoryID Deleted";
    }

    @Override
    public Category updatecategory(Category updateCategory, Integer id) {
        Category exitCategory = categoryRepo.findById(updateCategory.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException("you need to create category"));
        exitCategory.setCategoryId(updateCategory.getCategoryId());
        exitCategory.setCategoryName(updateCategory.getCategoryName());
        categoryRepo.save(exitCategory);
        return exitCategory;
    }
}

