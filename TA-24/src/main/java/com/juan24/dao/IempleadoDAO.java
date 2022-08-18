package com.juan24.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.juan24.dto.Empleado;

public interface IempleadoDAO extends JpaRepository <Empleado,Long>{

}
