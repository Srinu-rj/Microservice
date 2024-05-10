package com.category.category.controller;


import com.category.category.entuti.Category;
import com.category.category.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category")
@Slf4j
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/addCategory")
    public Category addCategory(@RequestBody @Valid Category category) {
        return categoryService.addCategory(category);
    }

    @PostMapping("/addMore")
    public List<Category> addListCategory(@RequestBody List<Category> categories) {
        return categoryService.saveCategory(categories);
    }

    @GetMapping("/get/{categoryId}")
    public Category categoryByID(@RequestParam int categoryId){
        return categoryService.categoryByID(categoryId);
    }
    @GetMapping("/get")
    public List<Category> findAllCategory() {
        return categoryService.getAllcategorys();
    }

    @DeleteMapping("/findMobile/{cartId}")
    public String delete(@PathVariable("cartId") String cartId) {
        log.info("foodCart delete",cartId);
        return categoryService.deleteByID(cartId);

    }
    @PutMapping("/update/{id}")
    public Category updateAddress(@RequestBody Category updateCategory,Integer id){
        return categoryService.updatecategory(updateCategory,id);
    }


}

