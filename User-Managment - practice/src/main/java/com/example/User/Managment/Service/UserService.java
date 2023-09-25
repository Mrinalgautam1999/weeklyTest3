package com.example.User.Managment.Service;

import com.example.User.Managment.Entity.User;
import com.example.User.Managment.Repo.Password;
import com.example.User.Managment.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUser() {
        return userRepo.getAllUser();
    }

    public String addListUser(List<User> myUser) {
        getAllUser().addAll(myUser);
        return myUser.size()+" user were added in list";
    }



    public String changePassword(Integer userId, String userPassword) {
        for(User user : getAllUser()){
            if(user.getUserId().equals(userId)){
                user.setPassword(userPassword);
                return "your password has been changed";
            }
        }
        return userId + " is invalid";
    }

    public User getUserById(Integer id) {
        for(User user : getAllUser()){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public String deleteById(Integer id) {
        for(User user : getAllUser()){
            if(user.getUserId().equals(id)) {
                getAllUser().remove(id);
            }
            return "User were Deleted";
        }
        return "Invalid userId";
    }
}
