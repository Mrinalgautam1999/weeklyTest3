package com.example.User.Managment.Controller;


import com.example.User.Managment.Entity.User;
import com.example.User.Managment.Repo.Password;
import com.example.User.Managment.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("user/list")
    public String addListUser(@RequestBody @Valid List<User> myUser){
        return userService.addListUser(myUser);
    }
    @GetMapping("users")
    public List<User> getAllUser(){
       return userService.getAllUser();
    }

    @GetMapping("api/v1/user/by/{id}")
    public User getUserById(@PathVariable @Valid Integer id){
        return userService.getUserById(id);
    }

    @PutMapping("change/password")
    public String changePassword(@RequestBody @Valid Password password){
        return userService.changePassword(password.getUserId(),password.getUserPassword());
    }
    @DeleteMapping("Api/{id}/delete")
    public String deleteById(@PathVariable @Valid Integer id){
        return userService.deleteById(id);
    }
}
