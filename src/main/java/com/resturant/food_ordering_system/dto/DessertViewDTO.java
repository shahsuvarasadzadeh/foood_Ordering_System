package com.resturant.food_ordering_system.dto;

import com.resturant.food_ordering_system.controller.RestaurantController;
import com.resturant.food_ordering_system.entity.Dessert;

import java.io.Serializable;

public class DessertViewDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String name;

    private final String cost;

    private DessertViewDTO(String name, String cost) {
        this.name = name;
        this.cost = cost;
    }


    public static DessertViewDTO of(Dessert dessert){
        return new DessertViewDTO(dessert.getName(),dessert.getCost());
    }
}
