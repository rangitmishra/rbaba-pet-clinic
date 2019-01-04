package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.Pet;
import com.ranjeetbaba.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

}
