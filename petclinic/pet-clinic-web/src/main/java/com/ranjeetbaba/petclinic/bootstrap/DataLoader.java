package com.ranjeetbaba.petclinic.bootstrap;

import com.ranjeetbaba.petclinic.model.Owner;
import com.ranjeetbaba.petclinic.model.Vet;
import com.ranjeetbaba.petclinic.services.OwnerService;
import com.ranjeetbaba.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;

    private VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Knuth");
        owner1.setLastName("Buffet");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Morris");
        owner2.setLastName("Watson");
        ownerService.save(owner2);

        System.out.println("Load owners......");

        Vet vet1 = new Vet();
        vet1.setFirstName("Pratt");
        vet1.setLastName("Jackson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("John");
        vet2.setLastName("Thompson");
        vetService.save(vet2);

        System.out.println("Load vets.......");

    }
}
