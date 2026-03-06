package com.empresa.multiserviciosantarosa.aplicacion.ports.input;

import com.empresa.multiserviciosantarosa.infraestructura.rest.controller.dto.EmpleadoraDTO;

public interface IEmpleadoraInputPort {

    EmpleadoraDTO obtenerEmpleadoraPorId(Long id);
}
