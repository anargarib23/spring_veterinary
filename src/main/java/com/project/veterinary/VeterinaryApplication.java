package com.project.veterinary;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeterinaryApplication {
	
	@Autowired
	SessionFactory sessionFactory;

	public static void main(String[] args) {
		SpringApplication.run(VeterinaryApplication.class, args);
	}

}
