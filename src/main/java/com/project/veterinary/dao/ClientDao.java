package com.project.veterinary.dao;

import java.util.List;
import java.util.Optional;

import com.project.veterinary.model.Client;

public interface ClientDao {
	Optional<Client> getById();
	List<Client> getAll();
	void add(Client client);
	void update(Client client, Long id);
	void deleteById(Long id);
 }
