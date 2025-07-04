package com.shayan.workouttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shayan.workouttracker.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}