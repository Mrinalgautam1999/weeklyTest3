package com.example.Visitor.Count.repo;

import com.example.Visitor.Count.entity.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VisitorRepo {
    @Autowired
    List<Visitor> visitorList;

    public List<Visitor> getVisitorList() {
        return visitorList;
    }

}
