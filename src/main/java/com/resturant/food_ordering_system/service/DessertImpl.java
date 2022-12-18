package com.resturant.food_ordering_system.service;


import com.resturant.food_ordering_system.RestaurantRepository.DessertRepository;
import com.resturant.food_ordering_system.dto.DessertCreateDTO;
import com.resturant.food_ordering_system.dto.DessertViewDTO;
import com.resturant.food_ordering_system.entity.Dessert;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class DessertImpl implements DessertService{

    private DessertRepository dessertRepository;
    @Override
    public List<DessertViewDTO> getDessert() {
        return dessertRepository.findAll().stream().map(DessertViewDTO::of).collect(Collectors.toList());
    }

    @Override
    public DessertViewDTO createDessert(DessertCreateDTO dessertCreateDTO) {
        final Dessert dessert=dessertRepository.save(new Dessert(dessertCreateDTO.getName(),
                dessertCreateDTO.getCost()));
        return DessertViewDTO.of(dessert);
    }
}
