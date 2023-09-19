package com.example.Visitor.Count.service;

import com.example.Visitor.Count.entity.Visitor;
import com.example.Visitor.Count.repo.VisitorRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {
    @Getter
    @Autowired
    VisitorRepo visitorRepo;


    public List<Visitor> visitorList(){
        return visitorRepo.getVisitorList();
    }

     public String addVisitor(Visitor visitor) {
            visitorList().add(visitor);
         return visitorList().size() +" visitor were added" ;
    }


    public Integer getCount() {
        return visitorList().size();
    }

    public Integer totalCount(String userName) {
        Integer count = 0;
        for(Visitor visitor : visitorList()){
            if(visitor.getVisitorName().equals(userName))
                count++;
        }
        return count;
    }
}
