package com.example.demo.repository;



import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements CitaMedicaRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(CitaMedica citaMedica) {
		this.entityManager.persist(citaMedica);
		
	}

	@Override
	public void actualizar(String numeroCita) {
		this.entityManager.merge(numeroCita);
		
	}

	

}