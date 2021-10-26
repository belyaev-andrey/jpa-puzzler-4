package com.jokerconf.jpapuzzlers.services;

import com.jokerconf.jpapuzzlers.entities.Owner;
import com.jokerconf.jpapuzzlers.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class JpqlService {

    @Autowired
    private JpaContext jpaContext;

    @Autowired
    private OwnerRepository ownerRepository;

    @Transactional
    public void printOwnersWithPets() {
        jpaContext.getEntityManagerByManagedType(Owner.class)
                .createNamedQuery("owners-with-pets", Owner.class)
                .getResultList().forEach(owner -> {
            System.out.println("----");
            System.out.println(owner.toString().toUpperCase());
            owner.getPets().forEach(pet -> System.out.println(pet.toString().toUpperCase()));
        });
        System.out.println("----");
    }

    @Transactional
    public void renameOwner(Long id, String newName) {
        ownerRepository.renameOwner(id, newName);
    }


}