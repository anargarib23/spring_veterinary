package com.project.veterinary.service.impls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.veterinary.dao.PetDao;
import com.project.veterinary.model.Pet;
import com.project.veterinary.service.PetService;

public class PetServiceImpl implements PetService {
	
	@Autowired
	private PetDao<Pet> petDao;

	@Override
	public Optional<Pet> findById(Long id) {
		return petDao.getById(id);
	}

	@Override
	public List<Pet> findAll() {
		return petDao.getAll();
	}

	@Override
	public void add(Pet pet) {
		petDao.add(pet);
	}

}
