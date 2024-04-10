package com.restaurant.restaurant.controller;

import com.restaurant.restaurant.entity.Restaurant;
import com.restaurant.restaurant.service.RestaurantService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @PostMapping("/add")
    public Restaurant restaurant( @Valid  @RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @PostMapping("/addMore")
    public List<Restaurant> saveRestaurantsNames(@RequestBody List<Restaurant> restaurants) {
        return restaurantService.saveRestaurants(restaurants);
    }

    @GetMapping("/get")
    public List<Restaurant> fetchAllRestaurant() {
        return restaurantService.getAllRestants();
    }

    @GetMapping("/getId/{restaurantId}")
    public Restaurant getIdRestaurant(@PathVariable Integer restaurantId){
        return restaurantService.getIdByRestaurant(restaurantId);
    }
    @PutMapping("/update/{id}")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable Integer id) {
        return restaurantService.updateRestaurant(restaurant,id);
    }

    @DeleteMapping("/deleteRestaurentId/{restaurantId}")
    public String deleteRestaurantById(@PathVariable Integer restaurantId) {
        return restaurantService.deleterestaurant(restaurantId);
    }
    @GetMapping("/manager/{managerName}")
    public Restaurant findRestaurantManagerName(@PathVariable String managerName){
        return restaurantService.findManagerName(managerName);
    }

}

