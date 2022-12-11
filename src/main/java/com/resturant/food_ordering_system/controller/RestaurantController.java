package com.resturant.food_ordering_system.controller;

import com.resturant.food_ordering_system.dto.DessertCreateDTO;
import com.resturant.food_ordering_system.dto.DessertViewDTO;
import com.resturant.food_ordering_system.service.DessertService;
import com.resturant.food_ordering_system.shared.GenericResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RestaurantController {
    private DessertService dessertService;

    @GetMapping("/v1/dessert")
    public ResponseEntity<List<DessertViewDTO>>getDessert(){
        final List<DessertViewDTO>dessert=dessertService.getDessert();
        return ResponseEntity.ok(dessert);
    }

    @PostMapping("/v1/dessert")
    public ResponseEntity<?>createDessert(@Valid @RequestBody DessertCreateDTO dessertCreateDTO){
        dessertService.createDessert(dessertCreateDTO);
        return  ResponseEntity.ok(new GenericResponse("Dessert Created"));

    }

    @GetMapping("/welcome")
    public String welcomePage(){
        return "welcome";
    }

    @GetMapping("/menu")
    public String loginPage(){
        return "menu";
    }

}
