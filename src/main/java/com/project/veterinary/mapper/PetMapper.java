package com.project.veterinary.mapper;

import com.project.veterinary.dto.PetRequestDTO;
import com.project.veterinary.model.Pet;

public interface PetMapper {
	Pet toPet(PetRequestDTO request);
}
