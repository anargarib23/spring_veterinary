package com.project.veterinary.service;

import java.util.List;
import java.util.Optional;

import com.project.veterinary.model.Client;

public interface ClientService {
	Optional<Client> findById();
	List<Client> findAll();
	void add(Client client);
	void update(Client pet, Long id);
	void deleteById(Long id);
}
