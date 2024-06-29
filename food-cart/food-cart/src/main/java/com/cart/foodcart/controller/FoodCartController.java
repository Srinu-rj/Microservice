package com.cart.foodcart.controller;


import com.cart.foodcart.entuti.FoodCart;
import com.cart.foodcart.service.FoodCartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/food")
public class FoodCartController {

    private final FoodCartService cartService;

    @PostMapping("/add")
    public FoodCart saveCart(@RequestBody FoodCart foodCart) {
        return cartService.savecart(foodCart);
    }
    @PostMapping("/addMore")
    public List<FoodCart> addFoods(@RequestBody List<FoodCart> foodCarts) {
        return cartService.savefoods(foodCarts);
    }
    @GetMapping("/get")
    public List<FoodCart> fetchAllFoods() {
        return cartService.getfood();
    }

    @DeleteMapping("/delete{cartId}")
    public String deleteFoodid(@PathVariable("cartId") Integer cartId ){
        return cartService.deleteId(cartId);
    }
    @PutMapping("/update/{id}")
    public FoodCart updateFoodcart(@RequestBody FoodCart foodCart,@RequestParam Integer id){
        return cartService.updateFoodCartId(foodCart,id);
    }
}

