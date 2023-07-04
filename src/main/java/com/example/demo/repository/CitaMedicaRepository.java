package com.example.demo.repository;



import com.example.demo.repository.modelo.CitaMedica;


public interface CitaMedicaRepository {
	public void crear(
			CitaMedica citaMedica
			);
	
	public void actualizar(
			String numeroCita
			);
}