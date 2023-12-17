package com.srdjankrsmanovic.springaws.controller;

import com.srdjankrsmanovic.springaws.entity.Pet;
import com.srdjankrsmanovic.springaws.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping("/find-all")
    public List<Pet> getPets() {
        petRepository.save(new Pet(1l, "Pet1",new Date()));
        petRepository.save(new Pet(2l, "Pet2",new Date()));

        return petRepository.findAll();
    }
}
