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
public class Content {
    @Id
    @SequenceGenerator(
            name = "content_sequence",
            sequenceName = "content_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "content_sequence"
    )
    private long id;
    private String name;
    private byte[] video;
    private String description;
    private double rate;

    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn( name = "content_admin_id", referencedColumnName = "id")
    private Admin admin ;

    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn( name = "content_lesson_id", referencedColumnName = "id")
    private Lesson lesson ;

    @JsonIgnore
    @ManyToMany( mappedBy = "history")
    private List<Userk> content_viewers ;

}

