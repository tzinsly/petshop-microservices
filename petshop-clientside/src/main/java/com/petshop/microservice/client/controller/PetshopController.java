package com.petshop.microservice.client.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetshopController {

    @Value("${petshop}") String petshop;

    @GetMapping("/petshop-clientside")
    public String showPetshop() {
        return "The petshop is: " + petshop;
    }
}
