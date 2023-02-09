package com.project.veterinary.service.impls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.veterinary.dao.ClientDao;
import com.project.veterinary.model.Client;
import com.project.veterinary.service.ClientService;

public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientDao clientDao;

	@Override
	public Optional<Client> findById() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Client> findAll() {
		return clientDao.getAll();
	}

	@Override
	public void add(Client client) {
		clientDao.add(client);
		
	}

	@Override
	public void update(Client pet, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
