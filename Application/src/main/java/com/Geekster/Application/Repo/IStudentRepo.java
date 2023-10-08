package com.Geekster.Application.Repo;

import com.Geekster.Application.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface IStudentRepo extends JpaRepository<Student, Integer> {
}
