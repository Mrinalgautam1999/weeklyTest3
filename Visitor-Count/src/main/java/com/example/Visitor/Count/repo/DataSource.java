package com.example.Visitor.Count.repo;

import com.example.Visitor.Count.entity.Visitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class DataSource {
    @Bean
    public List<Visitor> visiterList(){
        return new ArrayList<>();
    }

}
