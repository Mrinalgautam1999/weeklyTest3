package com.example.Ecommerce.API.Repo;

import com.example.Ecommerce.API.Model.Order;
import com.example.Ecommerce.API.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    @Query(value = "select * from Products Where category=:category", nativeQuery = true)
    List<Product> findByCategory( String category);

    @Modifying
    @Query(value = "Delete from Products where id=:productId", nativeQuery = true)
    void getOrderByProductId(Integer productId);
}
