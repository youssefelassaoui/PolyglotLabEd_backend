package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private int number;
    @JsonIgnore
    @OneToMany(mappedBy = "semester")
    private List<Student> semesterStudents ;

    // many semester contain a subject
    @ManyToMany
    @JoinTable(
            name = "semestre_subjects",
            joinColumns = @JoinColumn( name = "semester_id"),
            inverseJoinColumns = @JoinColumn ( name = "subject_id")
    )
    private List<Subject> subjects ;
}
