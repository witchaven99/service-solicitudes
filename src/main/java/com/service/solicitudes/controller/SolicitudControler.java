package com.service.solicitudes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.solicitudes.dto.SolicitudDTO;
import com.service.solicitudes.model.Solicitud;
import com.service.solicitudes.service.SolicitudService;
import com.service.solicitudes.service.dto.SolicitudServiceDTO;

@Controller
@RequestMapping("api/solicitudes")
public class SolicitudControler {
	
	@Autowired
	private SolicitudService service;
	
	@Autowired
	private SolicitudServiceDTO serviceDTO;
	
//	@GetMapping
//	public ResponseEntity<List<Solicitud>> getSolicitudes(){
//		List<Solicitud> solicitudes = service.getAll();
//		if(solicitudes.isEmpty()) {
//			return ResponseEntity.noContent().build();
//		}
//		return ResponseEntity.ok(solicitudes);
//	}
	
	@GetMapping
	public ResponseEntity<List<SolicitudDTO>> getSolicitudes(){
		List<SolicitudDTO> solicitudes = serviceDTO.getAllSolicitudDTOs();
		if(solicitudes.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(solicitudes);
	}
	
	@GetMapping("/solicitures/{id}")
	public ResponseEntity<List<SolicitudDTO>> getSolicitudesByIdEmpleado(@PathVariable("id") Integer id){
		List<SolicitudDTO> solicitudes = serviceDTO.getSolicitudByEmpleado(id);
		if(solicitudes.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(solicitudes);
	}
	
	@PostMapping
	public ResponseEntity<Solicitud> saveEmpleado(@RequestBody Solicitud solicitud){
		Solicitud s = service.save(solicitud);
		return ResponseEntity.ok(s);
	}	

}
