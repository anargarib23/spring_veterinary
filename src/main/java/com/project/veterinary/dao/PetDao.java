package com.project.veterinary.dao;

import java.util.List;
import java.util.Optional;

import com.project.veterinary.model.Client;
import com.project.veterinary.model.Pet;

public interface PetDao {
	Optional<Pet> getById(Long id);
	List<Pet> getAll();
	void add(Pet pet);
	void update(Pet pet, Long id);
	void deleteById(Long id);
}
