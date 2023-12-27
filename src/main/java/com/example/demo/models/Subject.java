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
public class Subject {
    @Id
    @SequenceGenerator(
            name = "subject_sequence",
            sequenceName = "subject_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "subject_sequence"
    )
    private long id;
    private String name;

    // Subject Teacher Relationship
    @JsonIgnore
    @OneToMany(mappedBy = "subject")
    private List<Teacher> subjectTeacher ;

    // many subject can be studied in a semester
    @JsonIgnore
    @ManyToMany(mappedBy = "subjects")
    private List<Semester> semesters ;
}
