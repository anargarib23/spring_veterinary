package com.project.veterinary.dao.impls;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.veterinary.dao.PetDao;
import com.project.veterinary.model.Pet;

public class PetDAOImpl implements PetDao<Pet> {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Optional<Pet> getById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Pet pet = (Pet) session.createQuery("from Pet where id= :id", Pet.class).setParameter("id", id).getSingleResult();
		session.close();
		return Optional.ofNullable(pet);
	}

	@Override
	public List<Pet> getAll() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Pet> petList = session.createQuery("from Pet", Pet.class).getResultList();
		return petList;
	}

	@Override
	public void add(Pet pet) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.persist(pet);
		session.getTransaction().commit();
	}

	@Override
	public void update(Pet pet, Long id) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Pet petReference = (Pet) session.createQuery("from Pet where id=:id", Pet.class).
				setParameter("id", id).getSingleResult();
		pet.setId(petReference.getId());
		session.merge(pet);
		session.getTransaction().commit();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
