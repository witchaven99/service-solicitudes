package com.service.solicitudes.repo.dto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.service.solicitudes.dto.SolicitudDTO;

@Repository
public interface SolicitudRepoDTO extends JpaRepository<SolicitudDTO, Integer>{
	
	@Query(value = "SELECT s.id, s.codigo, s.descripcion, s.resumen, e.nombre "
			+ "FROM solicitud s "
			+ "INNER JOIN empleado e ON e.id_empleado = s.id_empleado ",nativeQuery = true)
	List<SolicitudDTO> getAllSolicitudes();
	
	@Query(value = "SELECT s.id, s.codigo, s.descripcion, s.resumen, e.nombre "
			+ "FROM solicitud s "
			+ "INNER JOIN empleado e ON e.id_empleado = s.id_empleado "
			+ "WHERE s.id_empleado = :idEmpleado ",nativeQuery = true)
	List<SolicitudDTO> getSolicitudesByEmpleado(@Param("idEmpleado") Integer idEmpelado);

}
