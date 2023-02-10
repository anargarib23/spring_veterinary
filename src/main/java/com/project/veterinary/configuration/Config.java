package com.project.veterinary.configuration;


import java.io.File;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.veterinary.dao.ClientDao;
import com.project.veterinary.dao.PetDao;
import com.project.veterinary.dao.impls.ClientDAOImpl;
import com.project.veterinary.dao.impls.PetDAOImpl;
import com.project.veterinary.service.ClientService;
import com.project.veterinary.service.PetService;
import com.project.veterinary.service.impls.ClientServiceImpl;
import com.project.veterinary.service.impls.PetServiceImpl;

@Configuration
public class Config {
	@Bean
	PetService petService() {
		return new PetServiceImpl();
	}
	
	@Bean
	PetDao petDao() {
		return new PetDAOImpl();
	}
	
	@Bean
	ClientDao clienttDao() {
		return new ClientDAOImpl();
	}
	
	@Bean
	ClientService clientService() {
		return new ClientServiceImpl();
	}
	
	
	@Bean(name="entityManagerFactory")
	SessionFactory sessionFactory() {
		org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();
		config.configure(new File("hibernate.cfg.xml"));
		SessionFactory sessionFactory = config.buildSessionFactory();
		return sessionFactory;
	}
}
