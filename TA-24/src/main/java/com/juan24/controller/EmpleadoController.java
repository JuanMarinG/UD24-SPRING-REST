package com.juan24.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.DeleteMapping;

import com.juan24.dto.Empleado;
import com.juan24.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List <Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@PostMapping ("/empleados")
	public Empleado guardarEmpleado (@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping ("/empleado/{Id}")
	public Empleado empleadoPorId(@PathVariable(name="Id")Long Id) {
		Empleado empleadoPorId = new Empleado();
		empleadoPorId=empleadoServiceImpl.empleadosPorId(Id);
		return empleadoPorId;
	}
	
	@PutMapping("/empleado/{Id}")
	public Empleado actualizarEmpleado(@PathVariable(name="Id")Long Id, @RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado = empleadoServiceImpl.empleadosPorId(Id);
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping ("/empleado/{Id}")
	public void eliminarEmpleado (@PathVariable(name="Id") Long Id) {
		empleadoServiceImpl.eliminarEmpleado(Id);
	}
}
