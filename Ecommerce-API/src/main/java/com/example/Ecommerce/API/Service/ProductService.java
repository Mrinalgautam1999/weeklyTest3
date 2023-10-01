package com.example.Ecommerce.API.Service;

import com.example.Ecommerce.API.Model.Order;
import com.example.Ecommerce.API.Model.Product;
import com.example.Ecommerce.API.Repo.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    public List<Product> getProductByCategory(String category) {
        return productRepo.findByCategory(category);
    }


    public String addProducts(List<Product> products) {
        productRepo.saveAll(products);
        return "product added";
    }

    @Transactional
    public String deleteProductByProductId(Integer productId) {
       productRepo.getOrderByProductId(productId);
       return productId+" deleted";
    }
}
