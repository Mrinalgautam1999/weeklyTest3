package com.example.mapping.Service;

import com.example.mapping.Model.Address;
import com.example.mapping.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public String addAddress(List<Address> newAddress) {
        addressRepo.saveAll(newAddress);
        return "Address is added";
    }


    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElseThrow();
    }

    public String changeById(Long id, Address newAddress) {
        Address address = addressRepo.findById(id).orElseThrow();
        address.setStreet(newAddress.getStreet());
        address.setCity(newAddress.getCity());
        address.setState(newAddress.getState());
        address.setZipCode(newAddress.getZipCode());
        return "updated";
    }

    public String removeById(Long id) {
        addressRepo.deleteById(id);
        return "deleted";
    }
}
