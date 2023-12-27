package com.example.demo.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class Lesson {
    @Id
    @SequenceGenerator(
            name = "lesson_sequence",
            sequenceName = "lesson_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "lesson_sequence"
    )
    private long id;
    private String name;
    private int number;

    @JsonIgnore
    @OneToMany(mappedBy = "lesson")
    List<Content> lessonContents;

    @JsonIgnore
    @ManyToMany( mappedBy = "lessons" )
    private List<Unity> unities ;
}
