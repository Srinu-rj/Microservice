package com.restaurant.restaurant.service;

import com.restaurant.restaurant.entity.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantService {
    Restaurant addRestaurant(Restaurant restaurant);
    List<Restaurant> saveRestaurants(List<Restaurant> restaurants);

    Restaurant updateRestaurant(Restaurant restaurant, Integer id);

    String deleterestaurant(Integer restaurantId);

    Restaurant findManagerName(String managerName);

    List<Restaurant> getAllRestants();

    Restaurant getIdByRestaurant(Integer restaurantId);
}
