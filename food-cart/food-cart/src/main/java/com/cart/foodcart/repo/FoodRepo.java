package com.cart.foodcart.repo;

import com.cart.foodcart.entuti.FoodCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends JpaRepository<FoodCart,Integer> {
}
