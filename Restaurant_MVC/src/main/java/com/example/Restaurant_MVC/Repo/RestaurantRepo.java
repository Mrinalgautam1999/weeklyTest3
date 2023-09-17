package com.example.Restaurant_MVC.Repo;

import com.example.Restaurant_MVC.Entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
/*@Component*/
public class RestaurantRepo {

    @Autowired
    List<Restaurant> restaurantList;

    public List<Restaurant> myResortBook() {
        return restaurantList;
    }
}
