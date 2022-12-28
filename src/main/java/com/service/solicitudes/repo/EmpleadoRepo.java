package com.service.solicitudes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.solicitudes.model.Empleado;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer>{

}
