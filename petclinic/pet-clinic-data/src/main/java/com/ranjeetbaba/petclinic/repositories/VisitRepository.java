package com.ranjeetbaba.petclinic.repositories;

import com.ranjeetbaba.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
