package com.geekster.Restaurant.App.Repo;

import com.geekster.Restaurant.App.Model.AdminTokens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AdminTokens, Integer> {
    AdminTokens findFirstByTokenValue(String tokenValue);
}
