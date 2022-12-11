package com.resturant.food_ordering_system.service;

import com.resturant.food_ordering_system.dto.DessertCreateDTO;
import com.resturant.food_ordering_system.dto.DessertViewDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DessertService {

 List<DessertViewDTO> getDessert();
 DessertViewDTO createDessert(DessertCreateDTO dessertCreateDTO);
}
