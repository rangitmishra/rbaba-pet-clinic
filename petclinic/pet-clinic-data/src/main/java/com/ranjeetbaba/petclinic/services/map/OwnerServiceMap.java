package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.Owner;
import com.ranjeetbaba.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
