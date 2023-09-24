package com.geekster.Job.Search.Portal.Controller;

import com.geekster.Job.Search.Portal.Model.Job;
import com.geekster.Job.Search.Portal.Model.Type;
import com.geekster.Job.Search.Portal.Service.JobService;
import jakarta.validation.Valid;
import org.hibernate.tool.schema.spi.SchemaTruncator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Validated
@RestController
public class JobController {

    @Autowired
    JobService jobService;


    /*USE CRUD REPOSITORY*/
    @PostMapping("api/v1/job")
    public String addJobs(@RequestBody @Valid List<Job> newJob){
        return jobService.addJobs(newJob);
    }

    @GetMapping("api/find/job")
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }
    @DeleteMapping("api/find/by/{id}")
    public String getJobById(@PathVariable @Valid Long id){
        return jobService.getDeletesById(id);
    }
    @PutMapping("api/v1/update/{id}/job/date")
    public String updateAppliedDate(@Valid @PathVariable Long id,@Valid @RequestBody LocalDateTime newAppliedDate) {
        return jobService.updateAppliedDate(id, newAppliedDate);
    }

    /*USE CUSTOM FINDERS*/
    @GetMapping("api/v1/type/{type}/And/salary/{salary}")
    public List<Job> getJobBySalaryAndType(Type type, double salary){
        return jobService.getJobBySalaryAndType(type, salary);
    }

    @GetMapping("api/v1/type/{type}/or/salary/{salary}")
    public List<Job> getJobBySalaryOrType(Type type, double salary){
        return jobService.getJobBySalaryOrType(type, salary);
    }
    @GetMapping("api/vi/less/salary/{salary}")
    public List<Job> getJobByLowerSalary(@PathVariable double salary){
        return jobService.getJobBySalary(salary);
    }

    @GetMapping("api/vi/greater/salary/{salary}")
    public List<Job> getJobByHigherSalary(@PathVariable double salary){
        return jobService.getJobByHigherSalary(salary);
    }

    /*crud by Query */
    @PutMapping("api/update/salary")
    public String updateBySalary(@RequestParam Long id, @RequestParam double salary){
        return jobService.updateBySalary(id, salary);
    }

    @PutMapping("api/update/date")
    public String updateAppliedDateById(@RequestParam Long id, @RequestParam LocalDateTime dateTime){
        return jobService.updateAppliedDateById(id, dateTime);
    }

    @DeleteMapping("api/delete/by/title")
    public String deletedByTitle(@RequestParam String title){
       return jobService.deletedByTitle(title);
    }


}
