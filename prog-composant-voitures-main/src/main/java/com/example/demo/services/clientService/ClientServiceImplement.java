package com.example.demo.services.clientService;

import com.example.demo.entity.ClientEntity;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/*
Classe Service qui implemente l'Interface Service de la table Client
*/
@Repository
@Transactional(readOnly = true)
public class ClientServiceImplement implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public Iterable<ClientEntity> getAllClient() {
        return this.clientRepository.findAll();
    }

    @Override
    public Optional<ClientEntity> getClientById(int id) {
        return this.clientRepository.findById(id);
    }

    @Override
    public ClientEntity addClient(ClientEntity clientEntity) {
        return this.clientRepository.save(clientEntity);
    }

    @Transactional
    @Override
    public void deleteClientById(int id) {
        this.clientRepository.deleteById(id);
    }
}
