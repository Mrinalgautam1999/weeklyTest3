package com.example.User.Managment.Repo;

import com.example.User.Managment.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class DataSource {
    @Bean
    public List<User> getUserList(){
        return new ArrayList<>();
    }
}
