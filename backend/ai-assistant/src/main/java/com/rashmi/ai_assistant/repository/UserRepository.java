package com.rashmi.ai_assistant.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rashmi.ai_assistant.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}