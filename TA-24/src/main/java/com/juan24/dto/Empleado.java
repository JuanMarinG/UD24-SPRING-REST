package com.juan24.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Empleado")

public class Empleado {

	//ATRIBUTOS TABLA EMPLEADO
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Nombre;
	private String Empleo;
	private double Salario;
	
	public Empleado () {
	}
	
	
	public Empleado(Long id, String nombre, String empleo, double salario) {
		super();
		Id = id;
		Nombre = nombre;
		Empleo = empleo;
		Salario = salario;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getEmpleo() {
		return Empleo;
	}


	public void setEmpleo(String empleo) {
		Empleo = empleo;
	}


	public double getSalario() {
		return Salario;
	}


	public void setSalario(double salario) {
		Salario = salario;
	}


	@Override
	public String toString() {
		return "Empleado [Id=" + Id + ", Nombre=" + Nombre + ", Empleo=" + Empleo + ", Salario=" + Salario + "]";
	}
	
	
	
	
}
