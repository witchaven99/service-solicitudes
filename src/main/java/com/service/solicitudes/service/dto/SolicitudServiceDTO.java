package com.service.solicitudes.service.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.solicitudes.dto.SolicitudDTO;
import com.service.solicitudes.repo.dto.SolicitudRepoDTO;

@Service
public class SolicitudServiceDTO {
	
	@Autowired
	private SolicitudRepoDTO dto;
	
	public List<SolicitudDTO> getAllSolicitudDTOs(){
		return dto.getAllSolicitudes();
	}
	
	public List<SolicitudDTO> getSolicitudByEmpleado(Integer id) {
		return dto.getSolicitudesByEmpleado(id);
	}

}
