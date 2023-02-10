package com.project.veterinary.service;

import java.util.List;
import java.util.Optional;

import com.project.veterinary.model.Client;
import com.project.veterinary.model.Pet;

public interface PetService {
	Optional<Pet> findById(Long id);
	List<Pet> findAll();
	void add(Pet pet, Client client);
	void addMultiple(List<Pet> petList, Client client);
	void update(Pet pet, Long id);
	void deleteById(Long id);
}
