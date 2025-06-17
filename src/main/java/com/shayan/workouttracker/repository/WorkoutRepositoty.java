package com.shayan.workouttracker.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shayan.workouttracker.model.Workout;

public interface WorkoutRepositoty extends JpaRepository<Workout, Long> {
    List<Workout> findByUserEmailOrderByScheduledDate(String email);
    List<Workout> findByUserEmailAndScheduledDateBefore(String email, LocalDateTime date);  
}
