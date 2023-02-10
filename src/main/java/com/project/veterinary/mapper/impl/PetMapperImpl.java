package com.project.veterinary.mapper.impl;

import java.lang.reflect.Field;
import java.util.Arrays;

import com.project.veterinary.dto.PetRequestDTO;
import com.project.veterinary.mapper.PetMapper;
import com.project.veterinary.model.Pet;

public class PetMapperImpl implements PetMapper{

	@Override
	public Pet toPet(PetRequestDTO request) {
		Pet pet = new Pet();
		
		pet.setBirthDate(request.getBirthDate());
		pet.setBreed(request.getBreed());
		pet.setName(request.getName());
		pet.setRegistrationDate(request.getRegistrationDate());
		pet.setSex(request.getSex());
		pet.setSpecies(request.getSpecies());
		pet.setSterilized(request.getSterilized());
		pet.setSterilizationDate(request.getSterilizationDate());
		
		
		return pet;
	}


}
