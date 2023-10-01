package com.example.Ecommerce.API.Service;

import com.example.Ecommerce.API.Controller.ProductController;
import com.example.Ecommerce.API.Model.Order;
import com.example.Ecommerce.API.Model.User;
import com.example.Ecommerce.API.Repo.ProductRepo;
import com.example.Ecommerce.API.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    @Autowired
    ProductRepo productRepo;

    public User getUserByUserId(Integer userId) {
        return userRepo.findById(userId).orElseThrow();
    }

    public String addUsers(List<User> users) {
        userRepo.saveAll(users);
        return "user added";
    }
}
