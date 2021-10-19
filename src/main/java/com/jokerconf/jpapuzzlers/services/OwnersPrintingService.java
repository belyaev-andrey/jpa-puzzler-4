package com.jokerconf.jpapuzzlers.services;

import com.jokerconf.jpapuzzlers.entities.Owner;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class OwnersPrintingService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void printOwnersWithPets() {
        entityManager.createNamedQuery("owners-with-pets", Owner.class).getResultList().forEach(owner -> {
            System.out.println("----");
            System.out.println(owner.toString().toUpperCase());
            owner.getPets().forEach(pet -> System.out.println(pet.toString().toUpperCase()));
        });
        System.out.println("----");
    }

}