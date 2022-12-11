package com.resturant.food_ordering_system.RestaurantRepository;

import com.resturant.food_ordering_system.entity.Dessert;
import com.resturant.food_ordering_system.entity.Drinks;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DrinkInter extends CrudRepository<Dessert,Integer> {
}
