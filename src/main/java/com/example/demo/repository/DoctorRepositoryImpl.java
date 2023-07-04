package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class DoctorRepositoryImpl implements DoctorRepository{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void crear(Doctor doctor) {
		this.entityManager.persist(doctor);
		
	}

	@Override
	public Doctor leer(Integer id) {
		
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void actualizar(Doctor doctor) {
		//this.eliminar(doctor.getCedula());
		this.entityManager.merge(doctor);
		
	}

	@Override
	public void eliminar(Integer id) {
		Doctor doctor = this.leer(id);
		this.entityManager.remove(doctor);
		
	}
	@Override
	public Doctor seleccionarPorNombre(String nombre) {
		//SQL
		//SELECT * FROM videojuego e WHERE e.vdjo_nombre=
		//JPQL 
		//SELECT e FROM Videojuego e WHERE e.nombre = 
		Query myQuery = this.entityManager.createQuery(
				"SELECT e FROM Doctor e WHERE e.nombre =:datoNombre ");
		myQuery.setParameter("datoNombre", nombre);
		return (Doctor)myQuery.getSingleResult();
	}


}