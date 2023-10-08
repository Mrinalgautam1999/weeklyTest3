package com.Geekster.Application.Repo;

import com.Geekster.Application.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
