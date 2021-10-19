package com.jokerconf.jpapuzzlers;

import com.jokerconf.jpapuzzlers.entities.Owner;
import com.jokerconf.jpapuzzlers.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPuzzler4Application implements CommandLineRunner {

    @Autowired
    private OwnerService ownerService;

    public static void main(String[] args) {
        SpringApplication.run(JpaPuzzler4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = ownerService.getOwnerOnly(1L);
        System.out.println(owner);
        System.out.println();
    }
}