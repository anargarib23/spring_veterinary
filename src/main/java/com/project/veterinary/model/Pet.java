package com.project.veterinary.model;


import java.util.Date;
import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

enum Species {
	DOG, CAT, BIRD, FISH, RACCOON;
}

@Entity
@Table(name="pet")
public class Pet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String sex;
	
	@Column(name="breed")
	private String breed;
	
	@Column(nullable=false)
	private String species;
	
	private Boolean sterilized;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="registration_date")
	private Date registrationDate;
	
	@Column(name="sterilization_date")
	private Date sterilizationDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Client client;
	
	@OneToMany(fetch = FetchType.EAGER)
	@Cascade({CascadeType.ALL})
	@JoinColumn(name="pet_id")
	private List<Operation> operations;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Boolean getSterilized() {
		return sterilized;
	}

	public void setSterilized(Boolean sterilized) {
		this.sterilized = sterilized;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Date getSterilizationDate() {
		return sterilizationDate;
	}

	public void setSterilizationDate(Date sterilizationDate) {
		this.sterilizationDate = sterilizationDate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	public void addOperation(Operation operation) {
		operations.add(operation);
	}
	
}
