package com.example.demo.service;



import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CitaMedicaRepository;
import com.example.demo.repository.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService{
	
	@Autowired
	private CitaMedicaRepository citaMedicaRepository;

	@Override
	public void agregar(CitaMedica citaMedica) {
		this.citaMedicaRepository.crear(citaMedica);
		
	}

	
	
}