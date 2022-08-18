package com.juan24.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan24.dao.IempleadoDAO;
import com.juan24.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IempleadoService{

	
	@Autowired
	IempleadoDAO iempleadoDAO;
	@Override
	public List<Empleado> listarEmpleados(){
		return iempleadoDAO.findAll();
	}
	
	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return iempleadoDAO.save(empleado);
		
	
	}

	@Override
	public  Empleado empleadosPorId(Long Id) {
		return iempleadoDAO.findById(Id).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return iempleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Long Id) {
		iempleadoDAO.deleteById(Id);
	}
}
