package com.example.Ecommerce.API.Controller;


import com.example.Ecommerce.API.Model.Address;
import com.example.Ecommerce.API.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;


    //------------------------- add address
    @PostMapping("addresses")
    public String addAddresses(@RequestBody List<Address> addresses ){
        return addressService.addAddresses(addresses);
    }
}
