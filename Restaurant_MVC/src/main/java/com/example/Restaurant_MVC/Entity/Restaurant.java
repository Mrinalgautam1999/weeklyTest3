package com.example.Restaurant_MVC.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private String restaurantName;
    private Integer restaurantId;
    private String address;
    private String phoneNumber;
    private String speciality;
    private Integer staffs;
    private Integer rating;
}
