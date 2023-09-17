package com.example.Restaurant_MVC.Service;

import com.example.Restaurant_MVC.Entity.Restaurant;
import com.example.Restaurant_MVC.Repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> resturantList() {
        return restaurantRepo.myResortBook();
    }

    public Restaurant getRestaurant(Integer id) {
        for(Restaurant restaurant : restaurantRepo.myResortBook())
        {
            if(restaurant.getRestaurantId().equals(id))
                return restaurant;
        }
        return null;
    }

    public String addRestaurant(Restaurant restaurant) {
        restaurantRepo.myResortBook().add(restaurant);
        return "Added Successfully";
    }

    public List<Restaurant> myRestroList(List<Restaurant> restaurantList) {
        for(Restaurant restaurant : restaurantList){
            addRestaurant(restaurant);
        }
        return restaurantList;
    }
    public String changeInRestaurant(Restaurant restaurant) {
        for(Restaurant restaurant1 : restaurantRepo.myResortBook() )
        {
            if(restaurant1.getRestaurantId().equals(restaurant.getRestaurantId())){
                restaurant1.setRestaurantId(restaurant.getRestaurantId());
                restaurant1.setRestaurantName(restaurant.getRestaurantName());
                restaurant1.setAddress(restaurant.getAddress());
                restaurant1.setRating(restaurant.getRating());
                restaurant1.setPhoneNumber(restaurant.getPhoneNumber());
                restaurant1.setSpeciality(restaurant.getSpeciality());
                restaurant1.setStaffs(restaurant.getStaffs());
                return "update all details";
            }
        }
        return "Invalid Details";
    }

    public String deleteResort(Integer id) {
        for(Restaurant restaurant : restaurantRepo.myResortBook()){
            if(restaurant.getRestaurantId().equals(id)){
                restaurantRepo.myResortBook().remove(restaurant);
                return "Deleted";
            }
        }
        return "Invalid Id";
    }


}
