package com.project.veterinary;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.project.veterinary.dto.PetRequestDTO;
import com.project.veterinary.mapper.PetMapper;
import com.project.veterinary.mapper.impl.PetMapperImpl;
import com.project.veterinary.model.Pet;

@SpringBootApplication
@EntityScan( basePackages = {"com.project.veterinary.model"} )
public class VeterinaryApplication {
	
	@Autowired
	SessionFactory sessionFactory;

	public static void main(String[] args) {
		SpringApplication.run(VeterinaryApplication.class, args);
	}

}
