package com.example.Ecommerce.API.Controller;

import com.example.Ecommerce.API.Model.Order;
import com.example.Ecommerce.API.Model.User;
import com.example.Ecommerce.API.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    // ---------------------add Users
    @PostMapping("users")
    public String userAdd(@RequestBody List<User> users ){
        return userService.addUsers(users);
    }

    @GetMapping("user/by/{userId}")
    public User getUserByUserId(@PathVariable Integer userId){
        return userService.getUserByUserId(userId);
    }

}
