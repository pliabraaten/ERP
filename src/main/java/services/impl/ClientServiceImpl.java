package services.impl;

import models.Client;
import repository.ClientRepository;
import services.ClientService;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients() {

        return clientRepository.findAll();
    }
}
