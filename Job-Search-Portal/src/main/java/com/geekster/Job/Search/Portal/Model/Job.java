package com.geekster.Job.Search.Portal.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Job {

    @Id
    @NotNull
    private Long id;
    @NotBlank
    private String title;

    private String description;

    private String location;

    @Min(20000)
    private Double salary;
    @Email
    private String companyEmail;
    @NotBlank
    private String companyName;
    @NotBlank
    private String employerName;

    @Enumerated(EnumType.STRING)

    private Type jobType;

    private LocalDateTime appliedDate;
}
