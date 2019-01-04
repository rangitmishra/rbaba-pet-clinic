package com.ranjeetbaba.petclinic.services.map;

import com.ranjeetbaba.petclinic.model.Owner;
import com.ranjeetbaba.petclinic.model.Pet;
import com.ranjeetbaba.petclinic.services.OwnerService;
import com.ranjeetbaba.petclinic.services.PetService;
import com.ranjeetbaba.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    private PetService petService;
    private PetTypeService petTypeService;

    public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner save(Owner object) {
        if(object != null) {
            if(object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null) {
                        if(pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }

                    } else {
                        throw new RuntimeException("Pet type is required.");
                    }

                    if(pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        //This line is not required
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }

        return null;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

}
