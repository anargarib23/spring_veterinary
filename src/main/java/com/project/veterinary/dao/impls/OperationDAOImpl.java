package com.project.veterinary.dao.impls;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.veterinary.dao.OperationDao;
import com.project.veterinary.model.Operation;

public class OperationDAOImpl implements OperationDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Optional<Operation> getById(Long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Operation operation = session.getReference(Operation.class, id);
		session.close();
		return Optional.of(operation);
	}

	@Override
	public List<Operation> getAll() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Operation> operationList = session.createQuery("from Operation", Operation.class).getResultList();
		session.close();
		return operationList;
	}

	@Override
	public void add(Operation operation) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(operation);
		
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void update(Operation operation, Long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Operation operationReference = session.getReference(Operation.class, id);
		operation.setId(operationReference.getId());
		session.merge(operation);
		
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void deleteById(Long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Operation operation = session.getReference(Operation.class, id);
		session.remove(operation);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
