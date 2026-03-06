package com.empresa.multiserviciosantarosa.aplicacion.mapper;

import com.empresa.multiserviciosantarosa.dominio.model.Empleadora;
import com.empresa.multiserviciosantarosa.infraestructura.rest.controller.dto.EmpleadoraDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IEmpleadoraDtoMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "apellidoPaterno", target = "apellidoPaterno")
    EmpleadoraDTO toEmpleadoraDTO(Empleadora empleadora);

}
