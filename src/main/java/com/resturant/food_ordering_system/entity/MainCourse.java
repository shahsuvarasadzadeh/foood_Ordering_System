package com.resturant.food_ordering_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "main_course")
public class MainCourse {
    @Id
    private int id;
    @Column(name = "mc_name", nullable = false, length = 50, unique = true)
    private String name;
    @Column(name = "mc_cost", nullable = false, length = 50, unique = true)
    private String cost;

    public MainCourse(String name, String cost) {
        this.name = name;
        this.cost = cost;
    }
}
