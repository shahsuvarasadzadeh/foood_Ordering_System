package com.resturant.food_ordering_system.RestaurantRepository;

import com.resturant.food_ordering_system.entity.Dessert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DessertRepository extends JpaRepository<Dessert,Long> {
//    boolean existsDessertByDessertname(String dessertname);
}
