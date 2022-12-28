package com.service.solicitudes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.solicitudes.model.Empleado;
import com.service.solicitudes.service.EmpleadoService;

@Controller
@RequestMapping("api/empleados")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService service;
	
	@GetMapping
	public ResponseEntity<List<Empleado>> getEmpleados(){
		List<Empleado> empleados = service.getAll();
		if(empleados.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(empleados);
	}
	
	@PostMapping
	public ResponseEntity<Empleado> saveEmpleado(@ModelAttribute("empleado") Empleado empleado, Model model){
		Empleado e = service.save(empleado);
		return ResponseEntity.ok(e);
	}
	
//	@PostMapping
//	public String saveEmpleado(@ModelAttribute("empleado") Empleado empleado, Model model){
//		Empleado e = service.save(empleado);
//		return "reado";
//	}

}
