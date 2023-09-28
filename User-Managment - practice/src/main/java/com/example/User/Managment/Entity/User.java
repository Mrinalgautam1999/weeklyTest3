package com.example.User.Managment.Entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull
    private Integer userId;

    @NotBlank
    private String userName;

    @Email
    private String userEmail;

    @Size(min = 8)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$" )
    private String password;

    @Size(min = 0, max = 13) // Define your own size constraints if needed
    @Pattern(regexp = "^\\+91\\d{10}$", message = "Numbers should be in Digits only")
    private String phoneNumber;

    @Min(18)
    private Integer userAge;

    private Gender gender;
    private Type userType;
    private LocalDateTime userDOB;


}
