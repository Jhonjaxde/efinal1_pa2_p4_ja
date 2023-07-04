package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public void agregar(Doctor doctor) {
		this.doctorRepository.crear(doctor);
		
	}

	@Override
	public Doctor buscar(Integer id) {
		
		return this.doctorRepository.leer(id);
	}

	@Override
	public void actualizar(Doctor doctor) {
		this.doctorRepository.actualizar(doctor);
		
	}

	@Override
	public void borrar(Integer id) {
		this.doctorRepository.eliminar(id);
		
	}
	@Override
	public Doctor encontrarPorNombre(String nombre) {
		
		return this.doctorRepository.seleccionarPorNombre(nombre);
	}


}