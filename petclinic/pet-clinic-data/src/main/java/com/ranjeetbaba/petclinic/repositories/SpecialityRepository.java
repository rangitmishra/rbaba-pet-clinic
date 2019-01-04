package com.ranjeetbaba.petclinic.repositories;

import com.ranjeetbaba.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
