package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.PetType;
import com.ranjeetbaba.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
}
