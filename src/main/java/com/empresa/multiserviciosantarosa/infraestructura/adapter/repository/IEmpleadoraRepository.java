package com.empresa.multiserviciosantarosa.infraestructura.adapter.repository;

import com.empresa.multiserviciosantarosa.infraestructura.adapter.entity.EmpleadoraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoraRepository extends JpaRepository<EmpleadoraEntity, Long> {
}
