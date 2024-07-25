package com.student.student.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="STUDENT_DB")
@Validated
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "name shoudnot be empty!!")
    private String Name;
    @Min(18)
    @Max(54)
    private int age;
    @NotBlank(message = "gender not be empty")
    private String Gender;
}
