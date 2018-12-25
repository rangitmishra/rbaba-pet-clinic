package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.Pet;
import com.ranjeetbaba.petclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
