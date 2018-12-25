package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.Pet;
import com.ranjeetbaba.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

}
