package com.example.Ecommerce.API.Service;

import com.example.Ecommerce.API.Controller.ProductController;
import com.example.Ecommerce.API.Model.Order;
import com.example.Ecommerce.API.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public Order getOrderByOrderId(Integer id) {
        return orderRepo.findById(id).orElseThrow();
    }


    public String addOrder(Order order) {
        orderRepo.save(order);
        return "order added";
    }
}
