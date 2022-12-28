package com.service.solicitudes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.solicitudes.model.Solicitud;
import com.service.solicitudes.repo.SolicitudRepo;

@Service
public class SolicitudService {
	
	@Autowired
	private SolicitudRepo solicitudRepo;
	
	public List<Solicitud> getAll(){
		return solicitudRepo.findAll();
	}
	
	public Solicitud getSolicitudByID(Integer id) {
		return solicitudRepo.findById(id).orElse(null);
	}
	
	public Solicitud save(Solicitud e) {
		return solicitudRepo.save(e);
	}

}
