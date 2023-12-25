package com.example.demo.repository;

import com.example.demo.models.Userk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserlRepository extends JpaRepository<Userk, Long> {
Optional<Userk> findByEmail(String email);
}
