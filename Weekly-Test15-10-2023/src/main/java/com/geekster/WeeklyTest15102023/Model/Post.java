package com.geekster.WeeklyTest15102023.Model;

import jakarta.persistence.*;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String postData;

    @ManyToOne
    @JoinColumn(name = "user_fk")
    User user;
}
