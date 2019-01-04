package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.Visit;
import com.ranjeetbaba.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VistServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Visit save(Visit visit) {

        if(visit.getPet() == null || visit.getPet().getId() == null || visit.getPet().getOwner() == null ||
                visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid visit");
        }
        return super.save(visit);
    }
}
