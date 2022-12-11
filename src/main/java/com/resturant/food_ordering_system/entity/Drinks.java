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
@Table(name = "drinks")
public class Drinks {
    @Id
    private Integer id;
    @Column(name = "d_name", nullable = false, length = 50, unique = true)
    private  String name;
    @Column(name = "d_cost", nullable = false, length = 50, unique = true)
    private String cost;

    public Drinks(String name, String cost) {
        this.name = name;
        this.cost = cost;
    }


}
