package com.project.veterinary.dao.impls;

import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.veterinary.dao.ClientDao;

import com.project.veterinary.model.Client;
import org.hibernate.Session;

public class ClientDAOImpl implements ClientDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Optional<Client> getById(Long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Client client = session.createQuery("from Client where id=:id", Client.class).
				setParameter("id", id).getSingleResult();
		session.close();
		
		return Optional.of(client);
	}

	@Override
	public List<Client> getAll() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Client> clientList = session.createQuery("from Client", Client.class).getResultList();
		return clientList;
	}

	@Override
	public void add(Client client) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.persist(client);
		session.getTransaction().commit();
	}

	@Override
	public void update(Client client, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
