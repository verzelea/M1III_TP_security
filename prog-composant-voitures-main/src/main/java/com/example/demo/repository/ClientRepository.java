package com.example.demo.repository;

import com.example.demo.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
Class Repository pour faire les requetes SQL pour la table Client
*/
@RepositoryRestResource(path="client")
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
}
