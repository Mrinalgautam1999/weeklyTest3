package com.geekster.Job.Search.Portal.Repo;

import com.geekster.Job.Search.Portal.Model.Job;
import com.geekster.Job.Search.Portal.Model.Type;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface JobRepo extends CrudRepository<Job, Long> {

    List<Job> findByJobTypeAndSalaryLessThanEqual(Type type, double salary);

    List<Job> findBySalaryLessThan(double salary);

    List<Job> findBySalaryGreaterThan(double salary);

    List<Job> findByJobTypeOrSalaryLessThanEqual(Type type, double salary);


    @Modifying
    @Query("UPDATE Job j SET j.salary = :newSalary WHERE j.id = :jobId")
    void updateSalary(@Param("jobId") Long id, @Param("newSalary") Double salary);

    @Modifying
    @Query("UPDATE Job j SET j.appliedDate = :newAppliedDate WHERE j.id = :jobId")
    void updateAppliedDate(@Param("jobId") Long jobId, @Param("newAppliedDate") LocalDateTime newAppliedDate);

    @Modifying
    @Query("DELETE FROM Job j WHERE j.title = :jobTitle")
    void deleteByTitle(@Param("jobTitle") String jobTitle);
}
