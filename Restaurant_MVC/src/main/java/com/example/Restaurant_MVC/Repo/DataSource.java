package com.example.Restaurant_MVC.Repo;

import com.example.Restaurant_MVC.Entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataSource {

    @Bean
     public List<Restaurant> getRestaurant(){
        return new ArrayList<>();
    }
}
