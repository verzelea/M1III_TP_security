package com.example.demo.services.clientService;

import com.example.demo.entity.ClientEntity;

import java.util.Optional;

/*
Interface Service qui va effectuer les requetes des Controller, ici pour la table Client
*/
public interface ClientService {

    public Iterable<ClientEntity>getAllClient();

    Optional<ClientEntity> getClientById(int id);

    void deleteClientById(int id);

    ClientEntity addClient(ClientEntity clientEntity);
}
