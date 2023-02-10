package com.project.veterinary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.veterinary.dto.PetRequestDTO;
import com.project.veterinary.model.Pet;
import com.project.veterinary.service.PetService;

@RestController
@RequestMapping("/pet")
public class PetController {
	@Autowired
	private PetService petService;
	
	@GetMapping
	public List<Pet> getAllPets() {
		return petService.findAll();
	}
	
	@GetMapping("/{id}")
	public Pet getPet(@PathVariable Long id) {
		return petService.findById(id).orElse(null);
	}
	
	@PostMapping
	public ResponseEntity<String> addPet(@RequestBody PetRequestDTO petRequest) {
//		petService.add(pet);
		return ResponseEntity.ok("pet added");
	}
	
//	@PostMapping("/multiple")
//	public ResponseEntity<String> addPets(@RequestBody List<Pet> petList) {
//		petService.addMultiple(petList);
//		return ResponseEntity.ok("%d pets added".formatted(petList.size()));
//	}
	
	@PutMapping
	public ResponseEntity<String> updatePet(@RequestBody Pet pet, @RequestParam Long id) {
		petService.update(pet, id);
		return ResponseEntity.ok("pet updated");
	}
	
	@DeleteMapping
	public ResponseEntity<String> deletePet(@RequestParam Long id) {
		petService.deleteById(id);
		return ResponseEntity.ok("pet deleted");
	}
}
