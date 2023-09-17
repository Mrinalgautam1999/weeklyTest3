package com.example.Restaurant_MVC.Controller;

import com.example.Restaurant_MVC.Entity.Restaurant;
import com.example.Restaurant_MVC.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

//        get Restaurant by id using GetMapping.
    @GetMapping("find/detail/by/{id}")
    public Restaurant getDetailOfRestaurant(@PathVariable Integer id){
        return restaurantService.getRestaurant(id);
    }

//        -get all Restaurant using  GetMapping
    @GetMapping("allList")
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.resturantList();
    }
//        -Add some Restaurant to Restaurant lists using PostMapping
    @PostMapping("restaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

//    add a list of restaurant

    @PostMapping("list/rest")
    public List<Restaurant> addList(@RequestBody List<Restaurant> restaurantList){
        return restaurantService.myRestroList(restaurantList);
    }
//        -update Restaurant information like Specialty.
    @PutMapping("change/restaurant")
    public String changeInDetails(@RequestBody Restaurant restaurant){
        return restaurantService.changeInRestaurant(restaurant);
    }
//        -delete Restaurant from the list.
    @DeleteMapping("del/{id}/Rest")
    public String deleteRestaurant(@PathVariable Integer id){
        return restaurantService.deleteResort(id);
    }
}
