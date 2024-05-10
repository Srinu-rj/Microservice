package com.category.category.serviceImpl;


import com.category.category.entuti.Category;
import com.category.category.repo.CategoryRepo;
import com.category.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public Category addCategory(Category category) {
        log.info("Success added Category");
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
    public Category updatecategory(Category updateCategory, Integer id) {

        Category exitCategory = categoryRepo.findById(updateCategory.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException("you need to create category"));

        exitCategory.setCategoryName(updateCategory.getCategoryName());
        categoryRepo.save(exitCategory);
        return exitCategory;
    }

    @Override
    public Category categoryByID(int categoryId) {
        return categoryRepo.findById(categoryId).orElseThrow(null);
    }

    @Override
    public String deleteByID(String cartId) {
        categoryRepo.deleteById(Integer.valueOf(cartId));
        return "cart ID Deleted Success!";
    }
}

