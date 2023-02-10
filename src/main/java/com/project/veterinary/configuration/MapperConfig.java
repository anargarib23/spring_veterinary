package com.project.veterinary.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.veterinary.mapper.PetMapper;
import com.project.veterinary.mapper.impl.PetMapperImpl;

@Configuration
public class MapperConfig {
	
	@Bean
	PetMapper petMapper() {
		return new PetMapperImpl();
	}
}
