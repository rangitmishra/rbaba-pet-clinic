package com.ranjeetbaba.petclinic.repositories;

import com.ranjeetbaba.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
