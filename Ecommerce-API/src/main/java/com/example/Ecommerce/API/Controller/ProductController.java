package com.example.Ecommerce.API.Controller;

import com.example.Ecommerce.API.Model.Product;
import com.example.Ecommerce.API.Repo.ProductRepo;
import com.example.Ecommerce.API.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //--------------------- add products
    @PostMapping("products")
    public String addProducts(@RequestBody List<Product> products ){
        return productService.addProducts(products);
    }

    @GetMapping("api/all/product")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("api/product/by/{category}")
    public List<Product> getProductByCategory(@PathVariable String category){
        return productService.getProductByCategory(category);
    }
    @DeleteMapping("product/productId/{productId}")
    public String deleteProductByProductId(@PathVariable Integer productId){
        return productService.deleteProductByProductId(productId);
    }
}
