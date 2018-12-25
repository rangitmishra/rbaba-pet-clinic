package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.Owner;
import com.ranjeetbaba.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

}
