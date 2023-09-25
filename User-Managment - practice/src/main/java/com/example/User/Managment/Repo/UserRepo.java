package com.example.User.Managment.Repo;

import com.example.User.Managment.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepo {
    @Autowired
    List<User> userList;

    public List<User> getAllUser() {
        return userList;
    }
}
