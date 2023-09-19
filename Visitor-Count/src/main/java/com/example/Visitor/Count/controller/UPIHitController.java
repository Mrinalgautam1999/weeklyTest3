package com.example.Visitor.Count.controller;

import com.example.Visitor.Count.entity.Visitor;
import com.example.Visitor.Count.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UPIHitController {
    @Autowired
    VisitorService visitorService;

    @PostMapping("Visitor")
    public String addVisitor(@RequestBody Visitor visitor){
        return visitorService.addVisitor(visitor);
    }

    @GetMapping("visitors")
    public List<Visitor> totalNumberOfVisitor(){
        return visitorService.visitorList();
    }

    @GetMapping("total/Count")
    public Integer getTotalCount(){
        return visitorService.getCount();
    }

    @GetMapping("api/v1/visitor-count-app/username/{userName}/count")
    public Integer totalEntrySingleUser(@PathVariable String userName){
        return visitorService.totalCount(userName);
    }
}
