package com.project.veterinary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.veterinary.model.Pet;
import com.project.veterinary.service.PetService;

@RestController
@RequestMapping("/pet")
public class PetController {
	@Autowired
	private PetService petService;
	
	@GetMapping
	public List<Pet> getPet() {
		return petService.findAll();
	}
	
	@PostMapping
	public void addPet(@RequestBody Pet pet) {
		petService.add(pet);
	}
}
