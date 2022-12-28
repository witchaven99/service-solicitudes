package com.service.solicitudes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.solicitudes.model.Empleado;
import com.service.solicitudes.repo.EmpleadoRepo;

@Service
public class EmpleadoService {
	
	@Autowired
	private EmpleadoRepo empleadoRepo;
	
	public List<Empleado> getAll(){
		return empleadoRepo.findAll();
	}
	
	public Empleado getEmpleadoByID(Integer id) {
		return empleadoRepo.findById(id).orElse(null);
	}
	
	public Empleado save(Empleado e) {
		return empleadoRepo.save(e);
	}

}
