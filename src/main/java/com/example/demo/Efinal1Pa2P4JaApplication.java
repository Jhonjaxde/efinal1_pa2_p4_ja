package com.example.demo;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.CitaMedicaService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4JaApplication implements CommandLineRunner{

	@Autowired
	private DoctorService doctorService;
	@Autowired
	private CitaMedicaService citaMedicaService;
	
	@Autowired
	private PacienteService pacienteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4JaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		//quemados en lo que se ingresa los datos directamente
		Doctor doc1 = new Doctor();
		doc1.setNombre("jhon");
		doc1.setApellido("arteaga");
		doc1.setCedula("1234567890");
		doc1.setFechaNacimiento(LocalDateTime.of(2000, 5, 3, 12, 0));
		doc1.setNumeroConsultorio("54");
		doc1.setCodigoSenescyt("1234");
		doc1.setGenero("hombre");
		
		//this.doctorService.agregar(doc1);
		
		Paciente pac = new Paciente();
		pac.setApellido("Alcazar");
		pac.setCedula("17458963215");
		pac.setCodigoIess("1678");
		pac.setEstatura(1.8);
		pac.setFechaNacimiento(LocalDateTime.of(1990, 4, 12, 2, 0));
		pac.setGenero("Hombre");
		pac.setNombre("Cesar");
		pac.setPeso(66.5);
		
		//this.pacienteService.agregar(pac);
		
		List<CitaMedica> citasmedicas = new ArrayList<>();
		CitaMedica medica=  new CitaMedica();
		medica.setNumeroCita("69");
		medica.setDiagnostico("Esta malito");
		medica.setDoctor(doc1);
		medica.setFechaCita(LocalDateTime.of(2023, 5, 3, 11, 0));
		
		medica.setLugarCita("calderon");
		citasmedicas.add(medica);
		pac.setCitasMedicas(citasmedicas);
		
		this.citaMedicaService.agregar(medica);
		//this.doctorService.agregar(doc1);
		
		
		
		
	}
}
