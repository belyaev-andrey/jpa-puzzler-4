package com.jokerconf.jpapuzzlers.repositories;

import com.jokerconf.jpapuzzlers.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

    @Modifying
    @Query("update Owner o set o.name = :newName where o.id = :id")
    void renameOwner(@Param("id") Long id, @Param("newName") String newName);

}