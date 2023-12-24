package com.example.demo.models;
import jakarta.persistence.*;
import lombok.*;
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
}
