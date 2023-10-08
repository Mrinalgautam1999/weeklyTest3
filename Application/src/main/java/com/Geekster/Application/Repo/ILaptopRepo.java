package com.Geekster.Application.Repo;

import com.Geekster.Application.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop, Integer> {
}
