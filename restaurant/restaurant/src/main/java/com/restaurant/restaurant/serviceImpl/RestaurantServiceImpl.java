package com.restaurant.restaurant.serviceImpl;

import com.restaurant.restaurant.entity.Restaurant;
import com.restaurant.restaurant.repository.RestaurantRepository;
import com.restaurant.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Override
    public List<Restaurant> saveRestaurants(List<Restaurant> restaurants) {
        return restaurantRepository.saveAll(restaurants);
    }

    @Override
    public List<Restaurant> getAllRestants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
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
        var exits = restaurantRepository.findById(restaurant.getRestaurantId())
                .orElseThrow(() -> new IllegalArgumentException("There iss no Id Please Create"));

        exits.setRestaurantId(restaurant.getRestaurantId());
        exits.setRestaurantName(restaurant.getRestaurantName());
        exits.setManagerName(restaurant.getManagerName());
        exits.setContactNumber(restaurant.getContactNumber());
        restaurantRepository.save(exits);
        return exits;
    }

}
