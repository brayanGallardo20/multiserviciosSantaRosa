package com.empresa.multiserviciosantarosa.infraestructura.adapter;

import com.empresa.multiserviciosantarosa.aplicacion.ports.output.IEmpleadoraOutputPort;
import com.empresa.multiserviciosantarosa.dominio.model.Empleadora;
import com.empresa.multiserviciosantarosa.infraestructura.adapter.mapper.IEmpleadoraMapper;
import com.empresa.multiserviciosantarosa.infraestructura.adapter.repository.IEmpleadoraRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class EmpleadoraJpaAdapter implements IEmpleadoraOutputPort {

    private final IEmpleadoraRepository iEmpleadoraRepository;
    private final IEmpleadoraMapper iEmpleadoraMapper;

    @Override
    public Empleadora obtenerEmpleadoraPorId(Long id) {
        var empleadora = iEmpleadoraRepository.findById(id);

        if (empleadora.isEmpty()) {
            throw new IllegalArgumentException("Empleadora con id " + id + " no encontrada");
        }
        return iEmpleadoraMapper.toEmpleadora(empleadora.get());
    }
}
