package com.empresa.multiserviciosantarosa.aplicacion.usecase;

import com.empresa.multiserviciosantarosa.aplicacion.mapper.IEmpleadoraDtoMapper;
import com.empresa.multiserviciosantarosa.aplicacion.ports.input.IEmpleadoraInputPort;
import com.empresa.multiserviciosantarosa.infraestructura.adapter.EmpleadoraJpaAdapter;
import com.empresa.multiserviciosantarosa.infraestructura.rest.controller.dto.EmpleadoraDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmpleadoraUseCase implements IEmpleadoraInputPort {

    private final IEmpleadoraDtoMapper iEmpleadoraDtoMapper;
    private final EmpleadoraJpaAdapter empleadoraJpaAdapter;

    @Override
    public EmpleadoraDTO obtenerEmpleadoraPorId(Long id) {

        var empleadora = empleadoraJpaAdapter.obtenerEmpleadoraPorId(id);
        return iEmpleadoraDtoMapper.toEmpleadoraDTO(empleadora);
    }
}
