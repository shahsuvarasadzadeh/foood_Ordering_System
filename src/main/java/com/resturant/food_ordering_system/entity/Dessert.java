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
@Table(name = "dessert")
public class Dessert {
    @Id
    private Long id;

    @Column(name = "name", nullable = false, length = 50, unique = true)
    private String name;
    @Column(name = "cost", nullable = false, length = 50, unique = true)
    private String cost;

    public Dessert(String name, String cost) {
        this.name = name;
        this.cost = cost;
    }
}
