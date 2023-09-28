package com.example.University.Event.Managment.Application.controller;

import com.example.University.Event.Managment.Application.Model.Department;
import com.example.University.Event.Managment.Application.Model.Event;
import com.example.University.Event.Managment.Application.Model.Students;
import com.example.University.Event.Managment.Application.Service.ServiceClass;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Validated
public class Controller {

    @Autowired
    ServiceClass serviceClass;

    @PostMapping("api/vi/student")
    public String addStudent(@RequestBody @Valid List<Students> studentsList) {
        return serviceClass.addStudent(studentsList);
    }

    //  update student by department
    @PutMapping("api/vi/update")
    public String updateStudentDepartment(@RequestParam @Valid Integer studentId, @RequestParam @Valid Department department) {
        return serviceClass.updateStudentDepartment(studentId, department);
    }

    // delete student by student Id
    @DeleteMapping("student")
    public String deleteStudentById (@Valid @RequestParam Integer id){
        return serviceClass.deleteStudentById(id);
    }
    // get All students
    @GetMapping("allStudents")
    public List<Students> getAllStudents(){
        return  serviceClass.getAllStudents();
    }

    // get student by id
    @GetMapping("student/studentId/{studentId}")
    public List<Students> getStudentById(Integer studentId){
        return serviceClass.getStudentById(studentId);
    }

    // -------------------------------  Event Model   -------------------------------
//add events
    @PostMapping("events")
    public String addEvents(@Valid @RequestBody List<Event>  events){
        return serviceClass.addEvents(events);
    }

    // update events

    @PutMapping("events")
    public String updateEvents(@Valid @RequestBody Event event){
        return serviceClass.updateEvent(event);
    }
    // delete event
    @DeleteMapping("event/eventId/{id}")
    public String deleteEventById(@Valid @PathVariable Integer id){
        return serviceClass.deleteEventById(id);
    }
    // get all events by date
    @GetMapping("allEvents")
    public List<Event> getEvents(@Valid @RequestParam LocalDateTime time){
        return serviceClass.getEvents(time);
    }
}
