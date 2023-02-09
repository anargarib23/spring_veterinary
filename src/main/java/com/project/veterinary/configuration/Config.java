package com.project.veterinary.configuration;


import java.io.File;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.veterinary.dao.PetDao;
import com.project.veterinary.dao.impls.PetDAOImpl;
import com.project.veterinary.service.PetService;
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
	
	@Bean(name="entityManagerFactory")
	SessionFactory sessionFactory() {
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println(System.getProperty("user.dir"));
		org.hibernate.cfg.Configuration config = new org.hibernate.cfg.Configuration();
		config.configure(new File("hibernate.cfg.xml"));
		SessionFactory sessionFactory = config.buildSessionFactory();
		return sessionFactory;
	}
}
