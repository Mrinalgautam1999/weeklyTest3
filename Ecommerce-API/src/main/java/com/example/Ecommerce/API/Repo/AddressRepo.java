package com.example.Ecommerce.API.Repo;

import com.example.Ecommerce.API.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address , Integer> {
}
