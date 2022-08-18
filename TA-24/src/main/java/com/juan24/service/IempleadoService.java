package com.juan24.service;

import java.util.List;

import com.juan24.dto.Empleado;

public interface IempleadoService {
	
	//ALL
	public List<Empleado> listarEmpleados();
	
	//CREATE
	public Empleado guardarEmpleado (Empleado empleado);
	
	//READ
	public Empleado empleadosPorId (Long Id);
	
	//UPDATE
	public Empleado actualizarEmpleado (Empleado empleado);
	
	//DELETE
	public Empleado eliminarEmpleado (Long Id);
	
}
