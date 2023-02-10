package com.project.veterinary.dao.impls;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.veterinary.dao.DoctorDao;
import com.project.veterinary.model.Doctor;

public class DoctorDAOImpl implements DoctorDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Optional<Doctor> getById(Long id) {
		Session session = sessionFactory.openSession();
		Doctor doctor = session.getReference(Doctor.class, id);
		session.close();
		return Optional.of(doctor);
	}

	@Override
	public List<Doctor> getAll() {
		Session session = sessionFactory.openSession();
		List<Doctor> doctorList = session.createQuery("from Doctor", Doctor.class).getResultList();
		session.close();
		return doctorList;
	}

	@Override
	public void add(Doctor doctor) {
		Session session = sessionFactory.openSession();
		session.persist(doctor);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void update(Doctor doctor, Long id) {
		Session session = sessionFactory.openSession();
		Doctor doctorReference = session.getReference(Doctor.class, id);
		doctor.setId(doctorReference.getId());
		session.merge(doctor);
		
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteById(Long id) {
		Session session = sessionFactory.openSession();
		Doctor doctorReference = session.getReference(Doctor.class, id);
		
		session.remove(doctorReference);
		session.getTransaction().commit();
		session.close();
		
	}

}
