package com.resturant.food_ordering_system.RestaurantRepository;

import com.resturant.food_ordering_system.entity.Dessert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DessertInter extends JpaRepository<Dessert,Integer> {
//    boolean existsDessertByDessertname(String dessertname);
}
