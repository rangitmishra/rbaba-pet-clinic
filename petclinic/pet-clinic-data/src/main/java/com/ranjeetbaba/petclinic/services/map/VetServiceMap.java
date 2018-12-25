package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.Vet;
import com.ranjeetbaba.petclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
