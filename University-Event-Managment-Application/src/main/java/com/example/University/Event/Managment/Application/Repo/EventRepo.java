package com.example.University.Event.Managment.Application.Repo;

import com.example.University.Event.Managment.Application.Model.Event;
import com.example.University.Event.Managment.Application.Model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface EventRepo extends JpaRepository<Event, Integer> {
    @Modifying
    @Query(value = "delete from Event where event_id =:id", nativeQuery = true)
    void deleteEventById(Integer id);

    @Query(value = "select * from Event where start_time =:time", nativeQuery = true)
    List<Event> getEvent(LocalDateTime time);
}
