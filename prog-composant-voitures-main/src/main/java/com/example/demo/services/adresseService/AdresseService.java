package com.example.demo.services.adresseService;

import com.example.demo.entity.AdresseEntity;

import java.util.List;
import java.util.Optional;

/*
Interface Service qui va effectuer les requetes des Controller, ici pour la table Adresse
*/
public interface AdresseService {

    public Iterable<AdresseEntity>getAllAdresse();

    Optional<AdresseEntity> getAdresseById(int id);

    void deleteAdresseById(int id);

    AdresseEntity addAdresse(AdresseEntity adresseEntity);

    Iterable<AdresseEntity> getAllAdresseParam(List<String> id_adresse, List<String> libelle, List<String> id_concessionaire);
}
