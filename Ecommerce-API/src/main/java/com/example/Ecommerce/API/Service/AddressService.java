package com.example.Ecommerce.API.Service;

import com.example.Ecommerce.API.Model.Address;
import com.example.Ecommerce.API.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public String addAddresses(List<Address> addresses) {
        addressRepo.saveAll(addresses);
        return "addresses added";
    }
}
