package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.PetType;
import com.ranjeetbaba.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
}
