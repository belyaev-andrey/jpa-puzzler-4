package com.jokerconf.jpapuzzlers.services;

import com.jokerconf.jpapuzzlers.entities.Owner;
import com.jokerconf.jpapuzzlers.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private JpqlService jpqlService;

    @Transactional
    public Owner getOwnerOnly(Long id) {
        Owner owner = ownerRepository.findById(id).orElseThrow();
        //jpqlService.printOwnersWithPets();
        //jpqlService.renameOwner(id, "Jill");
        return owner;
    }

}