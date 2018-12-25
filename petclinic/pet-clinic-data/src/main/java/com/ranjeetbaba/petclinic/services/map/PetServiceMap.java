package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.Pet;
import com.ranjeetbaba.petclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>  {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
