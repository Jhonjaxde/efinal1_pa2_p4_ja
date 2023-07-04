package com.example.demo.repository;

import org.springframework.stereotype.Repository;


import com.example.demo.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class PacienteRepositoryImpl implements PacienteRepository{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(Paciente paciente) {
		
		this.entityManager.persist(paciente);
	}

	

	@Override
	public void actualizar(Paciente paciente) {
		this.entityManager.merge(paciente);
		
	}

	

}