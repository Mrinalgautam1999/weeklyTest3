package com.geekster.WeeklyTest15102023.Repo;

import com.geekster.WeeklyTest15102023.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<User, Integer> {
    User findFirstByEmail(String newEmail);
}
