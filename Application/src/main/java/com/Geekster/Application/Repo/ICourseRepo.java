package com.Geekster.Application.Repo;

import com.Geekster.Application.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course, Integer> {
}
