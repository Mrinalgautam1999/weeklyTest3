package com.example.Ecommerce.API.Controller;

import com.example.Ecommerce.API.Model.Order;
import com.example.Ecommerce.API.Model.User;
import com.example.Ecommerce.API.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    // ----------------- order place
    @PostMapping("order")
    public String addOrder(@RequestBody Order order ){
        return orderService.addOrder(order);
    }


    @GetMapping("api/order/by/id")
    public Order getOrderByOrderId(@RequestBody Integer id){
        return orderService.getOrderByOrderId(id);
    }





}
