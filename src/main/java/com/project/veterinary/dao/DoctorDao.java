package com.project.veterinary.dao;

import java.util.List;
import java.util.Optional;

import com.project.veterinary.model.Doctor;

public interface DoctorDao {
	Optional<Doctor> getById(Long id);
	List<Doctor> getAll();
	void add(Doctor doctor);
	void update(Doctor doctor, Long id);
	void deleteById(Long id);
}
