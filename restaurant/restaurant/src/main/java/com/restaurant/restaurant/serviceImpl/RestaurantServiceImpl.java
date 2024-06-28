package com.restaurant.restaurant.serviceImpl;


import com.restaurant.restaurant.entity.Restaurant;
import com.restaurant.restaurant.repository.RestaurantRepository;
import com.restaurant.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
//    private final ItemClient itemClient;

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> saveRestaurants(List<Restaurant> restaurants) {
        return restaurantRepository.saveAll(restaurants);
    }

    @Override
    public List<Restaurant> getAllRestants() {
        //TODO BASIC LOGIC FOR GET ID
//         return restaurantRepository.findAll();

        //TODO CREATE LIST FOR RESTAURANT
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants;
//        List<Restaurant> newRestaurantList = restaurants.stream().map(r -> {
//            r.setItemDos(itemClient.getRestaurantWithItem(r.getRestaurantId()));
//            return r;
//        }).collect(Collectors.toList());
//        return restaurants;
    }

    @Override
    public Restaurant getIdByRestaurant(Integer restaurantId) {

        //TODO BASIC LOGIC FOR GET ID
        return restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new IllegalArgumentException("Not Found Your Id.."));

//        //TODO RESTAURANT WITH ITEM CONNECTION
//        Restaurant exitsById = restaurantRepository.findById(restaurantId)
//                .orElseThrow(() -> new IllegalArgumentException("Not Found Your Id.."));
//        //TODO CREATE ITEM CLIENT  CONNECT ITEMdAO
//        exitsById.setItemDos(itemClient.getRestaurantWithItem(exitsById.getRestaurantId()));
//        return exitsById;
    }

    @Override
    public String deleterestaurant(Integer restaurantId) {
        restaurantRepository.deleteById(restaurantId);
        return "delete SuccessFull!";
    }

    @Override
    public Restaurant findManagerName(String managerName) {
        return restaurantRepository.managerName(managerName);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant, Integer id) {
        Restaurant exits = restaurantRepository.findById(restaurant.getRestaurantId())
                .orElseThrow(() -> new RuntimeException("There iss no Id Please Create"));

        Restaurant restaurant1 = new Restaurant();
        restaurant1.setRestaurantId(restaurant.getRestaurantId());
        restaurant1.setRestaurantName(restaurant.getRestaurantName());
        restaurant1.setManagerName(restaurant.getManagerName());
        restaurant1.setContactNumber(restaurant.getContactNumber());
        return restaurantRepository.save(restaurant1);

    }

}
