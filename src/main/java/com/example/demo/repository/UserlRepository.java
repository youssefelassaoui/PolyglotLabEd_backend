package com.example.demo.repository;

import com.example.demo.models.Userl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserlRepository extends JpaRepository<Userl, Long> {
Optional<Userl> findByEmail(String email);
}
