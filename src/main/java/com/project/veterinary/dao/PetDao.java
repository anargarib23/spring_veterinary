package com.project.veterinary.dao;

import java.util.List;
import java.util.Optional;

public interface PetDao<Pet> {
	Optional<Pet> getById(Long id);
	List<Pet> getAll();
	void add(Pet pet);
	void update(Pet pet, Long id);
	void deleteById(Long id);
}
