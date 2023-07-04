package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;


public interface DoctorRepository {
	public void crear(Doctor doctor);
	public Doctor leer(Integer id);
	public void actualizar(Doctor doctor);
	public void eliminar(Integer id);
	public Doctor seleccionarPorNombre(String nombre);
	

}