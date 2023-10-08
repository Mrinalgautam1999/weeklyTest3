package com.Geekster.Application.Controller;

import com.Geekster.Application.Model.Address;
import com.Geekster.Application.Model.Course;
import com.Geekster.Application.Model.Student;
import com.Geekster.Application.Service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

//    --------------------------------Address-----------------------------

    @GetMapping("api/addresses")
    public List<Address> GetAll(){
        return applicationService.getAll();
    }

    @PostMapping("api/upload/new/address")
    public String addAddress(@RequestBody List<Address> newAddress){
        return applicationService.addAddress(newAddress);
    }


    @PutMapping("update/{id}/address")
    public String updateAddress(@PathVariable Long id, @RequestBody Address address){
            return applicationService.updateAddress(id, address);
    }

    @DeleteMapping("remove/address")
    public String removeAddress(@RequestBody Integer id){
        return applicationService.removeAddress(id);
    }
    /*--------------------------------------------------------*/

    @PostMapping("student")
    public String createStudent(@RequestBody List<Student> student) {
        return applicationService.createStudent(student);
    }

    @GetMapping("students")
    public List<Student> getAllStudents() {
        return applicationService.getAllStudents();
    }
    @PutMapping("change/{studentId}")
    public Student updateStudent(@PathVariable Integer studentId, @RequestBody Address updatedStudent) {
        return applicationService.updateStudent(studentId, updatedStudent);
    }

    @DeleteMapping("remove/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId) {
       return applicationService.deleteStudent(studentId);
    }
    /*==========course========*/

    @PostMapping("course")
    public String createCourse(@RequestBody List<Course> course) {
        return applicationService.createCourse(course);
    }

    @GetMapping("Course")
    public List<Course> getAllCourse() {
        return applicationService.getAllCourse();
    }

}

