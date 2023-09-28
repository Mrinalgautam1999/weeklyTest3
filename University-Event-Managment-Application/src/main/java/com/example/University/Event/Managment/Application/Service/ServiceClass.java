package com.example.University.Event.Managment.Application.Service;

import com.example.University.Event.Managment.Application.Model.Department;
import com.example.University.Event.Managment.Application.Model.Event;
import com.example.University.Event.Managment.Application.Model.Students;
import com.example.University.Event.Managment.Application.Repo.EventRepo;
import com.example.University.Event.Managment.Application.Repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceClass {
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    EventRepo eventRepo;


    public String addStudent(List<Students> studentsList) {
        studentRepo.saveAll(studentsList);
        return "student added";
    }

    @Transactional
    public String updateStudentDepartment(Integer studentId, Department department) {
        studentRepo.updateStudentDepartment(studentId, department.name());
        return "updated";
    }

    public String deleteStudentById(Integer id) {
        studentRepo.deleteById(id);
        return id+" deleted";
    }

    public List<Students> getAllStudents() {
        return studentRepo.getAllStudents();
    }

    public List<Students> getStudentById(Integer studentId) {
        return studentRepo.getStudentById(studentId);
    }

    public String addEvents(List<Event> events) {
        eventRepo.saveAll(events);
        return events.size() + " added";
    }
    @Transactional
    public String updateEvent(Event event) {
        Optional<Event> optionalEventModel =  eventRepo.findById(event.getEventId());
        Event ev = optionalEventModel.orElse(new Event());

        if(ev.getEventId().equals(event.getEventId())){
            eventRepo.save(event);
            return " updated";
        }
        return " invalid id";
    }
    @Transactional
    public String deleteEventById(Integer id) {
        eventRepo.deleteEventById(id);
        return id + " delete";
    }

    public List<Event> getEvents(LocalDateTime time) {
        return eventRepo.getEvent(time);
    }
}
