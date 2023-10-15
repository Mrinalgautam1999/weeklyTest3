package com.geekster.WeeklyTest15102023.Repo;

import com.geekster.WeeklyTest15102023.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPost extends JpaRepository<Post, Integer> {
}
