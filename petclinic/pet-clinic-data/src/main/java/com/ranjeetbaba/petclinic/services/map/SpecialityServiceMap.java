package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.Speciality;
import com.ranjeetbaba.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
}
