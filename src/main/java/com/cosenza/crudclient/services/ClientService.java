package com.cosenza.crudclient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cosenza.crudclient.dto.ClientDTO;
import com.cosenza.crudclient.entities.Client;
import com.cosenza.crudclient.repositories.ClientRepository;



@Service 
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
       Client client = repository.findById(id).get();
       return new ClientDTO(client);
    }
}
