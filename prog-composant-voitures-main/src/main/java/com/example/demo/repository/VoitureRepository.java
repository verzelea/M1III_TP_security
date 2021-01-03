package com.example.demo.repository;

import com.example.demo.entity.VoitureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
Class Repository pour faire les requetes SQL pour la table Voiture
*/
@RepositoryRestResource(path="voiture")
public interface VoitureRepository extends JpaRepository<VoitureEntity, Integer> {
    @Query(value = "select * from voiture", nativeQuery = true)
    Iterable<VoitureEntity> findAllVoiture();
}
