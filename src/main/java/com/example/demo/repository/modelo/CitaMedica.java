package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "citaMedica")
public class CitaMedica {
	@GeneratedValue(generator = "seq_citaMedica", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_citaMedica", sequenceName = "seq_citaMedica", allocationSize = 1)
	@Id
	@Column(name = "cime_id")
	private Integer id;
	@Column(name = "cime_numeroCita")
	private String numeroCita;
	@Column(name = "cime_fechaCita")
	private LocalDateTime fechaCita;
	@Column(name = "cime_valorCita")
	private BigDecimal valorCita;
	@Column(name = "cime_lugarCita")
	private String lugarCita;
	@Column(name = "cime_diagnostico")
	private String diagnostico;
	@Column(name = "cime_receta")
	private String receta;
	@Column(name = "cime_fechaProximaCita")
	private LocalDateTime fechaProximaCita;
	
	@ManyToOne
	@JoinColumn(name = "cime_id_doctor")
	//@Cascade(CascadeType.ALL)
	private Doctor doctor; 
	
	
	@ManyToOne
	@JoinColumn(name = "cime_id_paciente")
	private Paciente paciente;
	//SET AND GET

	


	public Doctor getDoctor() {
		return doctor;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumeroCita() {
		return numeroCita;
	}


	public void setNumeroCita(String numeroCita) {
		this.numeroCita = numeroCita;
	}


	public LocalDateTime getFechaCita() {
		return fechaCita;
	}


	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}


	public BigDecimal getValorCita() {
		return valorCita;
	}


	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}


	public String getLugarCita() {
		return lugarCita;
	}


	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public String getReceta() {
		return receta;
	}


	public void setReceta(String receta) {
		this.receta = receta;
	}


	public LocalDateTime getFechaProximaCita() {
		return fechaProximaCita;
	}


	public void setFechaProximaCita(LocalDateTime fechaProximaCita) {
		this.fechaProximaCita = fechaProximaCita;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", numeroTurno=" + numeroCita + ", fechaCita=" + fechaCita + ", costoCita="
				+ valorCita + ", lugarCita=" + lugarCita + ", diagnostico=" + diagnostico + ", receta=" + receta
				+ ", fechaControl=" + fechaProximaCita + ", doctor=" + doctor + ", paciente=" + paciente + "]";
	}
	
	


}