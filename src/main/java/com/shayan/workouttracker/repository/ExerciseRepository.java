package com.shayan.workouttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shayan.workouttracker.model.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    
    
}
