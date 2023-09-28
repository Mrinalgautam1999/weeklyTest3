package com.example.University.Event.Managment.Application.Model;

import com.fasterxml.jackson.databind.annotation.EnumNaming;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Students {
    @NotNull
    @Id
    private Integer studentId;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Min(18) @Max(25)
    private Integer Age;
    @Enumerated(EnumType.STRING)
    private Department department;
}
