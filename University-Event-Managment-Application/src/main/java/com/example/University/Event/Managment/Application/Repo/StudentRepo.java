package com.example.University.Event.Managment.Application.Repo;

import com.example.University.Event.Managment.Application.Model.Department;
import com.example.University.Event.Managment.Application.Model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Students, Integer> {

    @Modifying
    @Query(value = "update Students set department =:department where student_id =:studentId", nativeQuery = true)
    void updateStudentDepartment(Integer studentId, String department);

    @Modifying
    @Query(value = "delete from Students where student_id =:id", nativeQuery = true)
    void deleteStudentById(Integer id);

    @Query(value = "select * from Students", nativeQuery = true)
    List<Students> getAllStudents();

    @Query(value = "select * from Students where student_id =:studentId", nativeQuery = true)
    List<Students> getStudentById(Integer studentId);
}
