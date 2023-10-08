package com.Geekster.Application.Service;

import com.Geekster.Application.Model.Address;
import com.Geekster.Application.Model.Course;
import com.Geekster.Application.Model.Student;
import com.Geekster.Application.Repo.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    IAddressRepo addressRepo;

    @Autowired
    IBookRepo bookRepo;

    @Autowired
    ICourseRepo courseRepo;

    @Autowired
    ILaptopRepo laptopRepo;

    @Autowired
    IStudentRepo studentRepo;

    public List<Address> getAll() {
        return addressRepo.findAll();
    }

    public String addAddress(List<Address> newAddress) {
        addressRepo.saveAll(newAddress);
        return "Address added";
    }

    public String updateAddress(Long id, Address address) {
        addressRepo.save(address);
        return "updated";
    }

    public String removeAddress(Integer id) {
        addressRepo.deleteById(id);
        return "deleted";
    }

    public String createStudent(List<Student> student) {
         studentRepo.saveAll(student);
         return "student added";
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(Integer studentId) {
        return studentRepo.findById(studentId).orElseThrow();
    }

    public Student updateStudent(Integer studentId, Address updatedStudent) {
        Student student = studentRepo.findById(studentId).orElseThrow();
        student.setAddress(updatedStudent);
        return studentRepo.save(student);
    }

    public String deleteStudent(Integer studentId) {
        studentRepo.deleteById(studentId);
        return "deleted";
    }

    public String createCourse(List<Course> course) {
         courseRepo.saveAll(course);
        return "course added";
    }

    public List<Course> getAllCourse() {
        return courseRepo.findAll();
    }

}
