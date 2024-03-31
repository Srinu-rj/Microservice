package com.restaurant.restaurant.repository;

import com.restaurant.restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {

    Restaurant managerName(String managerName);

}
