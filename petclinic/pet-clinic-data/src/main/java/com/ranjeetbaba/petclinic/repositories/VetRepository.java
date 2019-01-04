package com.ranjeetbaba.petclinic.repositories;

import com.ranjeetbaba.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
