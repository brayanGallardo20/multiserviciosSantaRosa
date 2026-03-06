package com.empresa.multiserviciosantarosa.infraestructura.adapter.repository;

import com.empresa.multiserviciosantarosa.infraestructura.adapter.entity.EmpleadaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadaRepository extends JpaRepository<EmpleadaEntity, Long> {
}
