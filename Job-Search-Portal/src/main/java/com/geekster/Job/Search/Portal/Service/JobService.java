package com.geekster.Job.Search.Portal.Service;

import com.geekster.Job.Search.Portal.Model.Job;
import com.geekster.Job.Search.Portal.Model.Type;
import com.geekster.Job.Search.Portal.Repo.JobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public String addJobs(List<Job> newJob) {
        jobRepo.saveAll(newJob);
        return "job is added";
    }

    public List<Job> getAllJobs() {
        return (List<Job>) jobRepo.findAll();
    }

    public String getDeletesById(Long id) {
        jobRepo.deleteById(id);
        return id +" were deleted";
    }
    public String updateAppliedDate(Long id, LocalDateTime newAppliedDate) {
        Job job = jobRepo.findById(id).orElse(null);
        if(job != null){
            job.setAppliedDate(newAppliedDate);
            jobRepo.save(job);
            return "Date is updated";
        }else{
            return "coming soon";
        }

    }

    public List<Job> getJobBySalaryAndType(Type type, double salary) {
        return jobRepo.findByJobTypeAndSalaryLessThanEqual(type,salary);
    }
    public List<Job> getJobBySalaryOrType(Type type, double salary) {
        return jobRepo.findByJobTypeOrSalaryLessThanEqual(type,salary);
    }

    public List<Job> getJobBySalary(double salary) {
        return jobRepo.findBySalaryLessThan(salary);
    }

    public List<Job> getJobByHigherSalary(double salary) {
        return jobRepo.findBySalaryGreaterThan(salary);
    }

    @Transactional
    public String updateBySalary(Long id, double salary) {
        jobRepo.updateSalary(id, salary);
        return "updated salary";
    }
    @Transactional
    public String updateAppliedDateById(Long id, LocalDateTime dateTime){
        jobRepo.updateAppliedDate(id, dateTime);
        return "updated date";
    }

    @Transactional
    public String deletedByTitle(@RequestParam String title){
        jobRepo.deleteByTitle(title);
        return "deleted";
    }

}
