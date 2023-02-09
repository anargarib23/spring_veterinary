package com.project.veterinary.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	@Column(name="species")
	private String species;
	
//	@Column(name="birth_date")
//	private Date birthDate;
//	
//	@Column(name="registration_date")
//	private Date registrationDate;
	
	@Column(name="sterilized")
	private Boolean sterilized;

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

//	public Date getBirthDate() {
//		return birthDate;
//	}
//
//	public void setBirthDate(Date birthDate) {
//		this.birthDate = birthDate;
//	}
//
//	public Date getRegistrationDate() {
//		return registrationDate;
//	}
//
//	public void setRegistrationDate(Date registrationDate) {
//		this.registrationDate = registrationDate;
//	}

	public Boolean getSterilized() {
		return sterilized;
	}

	public void setSterilized(Boolean sterilized) {
		this.sterilized = sterilized;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", species=" + species + ", sterilized=" + sterilized + "]";
	}


	
	
}
