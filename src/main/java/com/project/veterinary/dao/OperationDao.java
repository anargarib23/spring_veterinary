package com.project.veterinary.dao;

import java.util.List;
import java.util.Optional;

import com.project.veterinary.model.Operation;

public interface OperationDao {
	Optional<Operation> getById(Long id);
	List<Operation> getAll();
	void add(Operation operation);
	void update(Operation operation, Long id);
	void deleteById(Long id);
}
