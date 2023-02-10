package com.project.veterinary.dto;

import java.util.Date;

public class PetRequestDTO {
	
	private Long clientId;
	private String name;
	private String sex;
	private String breed;
	private String species;
	private Boolean sterilized;
	private Date birthDate;
	private Date registrationDate;
	private Date sterilizationDate;
	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public Boolean getSterilized() {
		return sterilized;
	}
	public void setSterilized(Boolean sterilized) {
		this.sterilized = sterilized;
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
	public Date getSterilizationDate() {
		return sterilizationDate;
	}
	public void setSterilizationDate(Date sterilizationDate) {
		this.sterilizationDate = sterilizationDate;
	}
	
	
	
}
