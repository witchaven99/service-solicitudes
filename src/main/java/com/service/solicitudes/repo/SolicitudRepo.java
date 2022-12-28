package com.service.solicitudes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.solicitudes.model.Solicitud;

@Repository
public interface SolicitudRepo extends JpaRepository<Solicitud, Integer>{

}
