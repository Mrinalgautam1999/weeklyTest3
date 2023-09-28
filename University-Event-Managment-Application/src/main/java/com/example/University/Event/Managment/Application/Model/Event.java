package com.example.University.Event.Managment.Application.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Data
@Entity
public class Event {

    @Id
    private Integer eventId;

    private String eventName;

    private String locationEvent;

    private LocalDate date;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}
