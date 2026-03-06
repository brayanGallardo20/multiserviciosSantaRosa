package com.empresa.multiserviciosantarosa.aplicacion.ports.output;

import com.empresa.multiserviciosantarosa.dominio.model.Empleadora;

public interface IEmpleadoraOutputPort {

    Empleadora obtenerEmpleadoraPorId(Long id);

}
