package com.ednSolutions.ws.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ednSolutions.ws.models.Client;
import com.ednSolutions.ws.repositories.ClientRepository;

@Service
@Transactional
public class ClientService {
	
	@Autowired
	ClientRepository repository;
	
	public Client create(Client client) {
		return repository.save(client);
	}
	
	public Client read(Integer id) {
		return repository.findOne(id);
	}

	public Client update(Client client) {
		Client clientUpdated = read(client.getId());
		
		if(clientUpdated != null) {
			return repository.save(client);
		}
		
		return clientUpdated;
	}
	
	public Client delete(Integer id) {
		Client client = read(id);
		
		if(client == null)
			return client;
		
		repository.delete(client);
		return client;
	}

	public Collection<Client> findAll() {
		return repository.findAll();
	}
	
}
