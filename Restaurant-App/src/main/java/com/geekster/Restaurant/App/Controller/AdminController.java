package com.geekster.Restaurant.App.Controller;

import com.geekster.Restaurant.App.Model.DTO.AdminDto;
import com.geekster.Restaurant.App.Model.DTO.AdminAuth;
import com.geekster.Restaurant.App.Model.DTO.AdminInputDto;
import com.geekster.Restaurant.App.Model.Users.Admin;
import com.geekster.Restaurant.App.Service.AdminService;
import com.geekster.Restaurant.App.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    FoodService foodService;

    @PostMapping("admin/signUp")
    public String adminSignUp(@RequestBody  Admin admin){
        return adminService.adminSignUp(admin);
    }

    @PostMapping("admin/signIn")
    public String adminSignIn(@RequestBody AdminDto adminDetail){
        return adminService.adminSignIn(adminDetail);
    }

    @DeleteMapping("admin/signOut")
    public String adminSignOut(@RequestBody AdminAuth adminAuth)
    {
        return adminService.adminSignOut(adminAuth);
    }

    @PostMapping("Food")
    public String addFoods(@RequestBody AdminInputDto adminAuth){
        return foodService.addFoods(adminAuth);
    }
}
