package com.ranjeetbaba.petclinic.services;

import com.ranjeetbaba.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
