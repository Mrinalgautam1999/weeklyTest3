package com.example.Ecommerce.API.Repo;

import com.example.Ecommerce.API.Model.Order;
import com.example.Ecommerce.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {


}
