//package com.restaurant.restaurant.client;
//
//
//import com.restaurant.restaurant.entity.ItemDto;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
//@FeignClient(url = "http://localhost:7003",value = "bill")
//public interface ItemClient {
//
//    @GetMapping("/item/restaurant/{itemId}")
//    List<ItemDto> getRestaurantWithItem(@PathVariable Integer itemId);
//
//}
