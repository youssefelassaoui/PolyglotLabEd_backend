package com.example.demo.models;
import jakarta.persistence.*;
import lombok.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class Level {
    @Id
    @SequenceGenerator(
            name = "level_sequence",
            sequenceName = "level_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "level_sequence"
    )
    private long id;
    private String abreviationLevel;
}

