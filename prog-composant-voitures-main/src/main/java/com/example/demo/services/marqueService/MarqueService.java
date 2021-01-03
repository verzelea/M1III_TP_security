package com.example.demo.services.marqueService;

import com.example.demo.entity.MarqueEntity;

import java.util.Optional;

/*
Interface Service qui va effectuer les requetes des Controller, ici pour la table Marque
*/
public interface MarqueService {

    public Iterable<MarqueEntity> getAllMarque();

    Optional<MarqueEntity> getMarqueById(int id);

    MarqueEntity addMarque(MarqueEntity marqueEntity);

    void deleteMarqueById(int id);
}
