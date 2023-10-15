package com.geekster.WeeklyTest15102023.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String token;
    private LocalDate tokenCreationDate;

    @OneToOne
    @JoinColumn(name = "User_fk")
    User user;

    public AuthenticationToken(User existingUser) {
        this.user = existingUser;
        token = UUID.randomUUID().toString();
        tokenCreationDate = LocalDate.now();

    }
}
