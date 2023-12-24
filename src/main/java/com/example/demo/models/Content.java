package com.example.demo.models;
import jakarta.persistence.*;
import lombok.*;

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

}

