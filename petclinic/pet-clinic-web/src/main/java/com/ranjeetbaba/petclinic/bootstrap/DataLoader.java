package com.ranjeetbaba.petclinic.bootstrap;

import com.ranjeetbaba.petclinic.model.*;
import com.ranjeetbaba.petclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;

    private VetService vetService;

    private PetTypeService petTypeService;

    private SpecialityService specialityService;

    private VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0) {
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        //We could have removed this line because we have written
        //the logic to save this data inside ownerServiceMap save().
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Knuth");
        owner1.setLastName("Buffet");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1234567891");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setName("bulten");
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());

        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Morris");
        owner2.setLastName("Watson");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1234567891");

        Pet fionasCat = new Pet();
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Fiona");
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);

        owner2.getPets().add(fionasCat);
        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setDate(LocalDate.now());
        catVisit.setPet(fionasCat);
        catVisit.setDescription("sneezy kitty");

        visitService.save(catVisit);

        System.out.println("Load owners......");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Speciality surgery = new Speciality();
        surgery.setDescription("Srugery");
        Speciality savedSurgery = specialityService.save(surgery);


        Vet vet1 = new Vet();
        vet1.setFirstName("Pratt");
        vet1.setLastName("Jackson");
        vet1.getSpecialities().add(savedRadiology);
        vet1.getSpecialities().add(savedDentistry);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("John");
        vet2.getSpecialities().add(savedSurgery);
        vet2.setLastName("Thompson");
        vetService.save(vet2);

        System.out.println("Load vets.......");
    }
}
