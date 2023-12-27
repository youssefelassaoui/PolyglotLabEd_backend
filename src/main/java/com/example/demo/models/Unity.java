package com.example.demo.models;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class Unity {
    @Id
    @SequenceGenerator(
            name = "unity_sequence",
            sequenceName = "unity_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "unity_sequence"
    )
    private long id;
    private String name;
    private int number;

    @ManyToMany
    @JoinTable(
            name = "unity_lessons",
            joinColumns = @JoinColumn( name = "unity_id"),
            inverseJoinColumns = @JoinColumn( name = "lesson_id")
    )
    private List<Lesson> lessons ;
}
