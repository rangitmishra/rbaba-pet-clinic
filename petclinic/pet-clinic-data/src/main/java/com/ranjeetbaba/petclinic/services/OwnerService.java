package com.ranjeetbaba.petclinic.services;

import com.ranjeetbaba.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
