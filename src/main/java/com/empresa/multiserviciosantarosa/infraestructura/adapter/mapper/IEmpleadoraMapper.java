package com.empresa.multiserviciosantarosa.infraestructura.adapter.mapper;

import com.empresa.multiserviciosantarosa.dominio.model.Empleadora;
import com.empresa.multiserviciosantarosa.infraestructura.adapter.entity.EmpleadoraEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IEmpleadoraMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "apellidoPaterno", target = "apellidoPaterno")
    Empleadora toEmpleadora(EmpleadoraEntity empleadoraEntity);

    @InheritInverseConfiguration
    EmpleadoraEntity toEmpleadoraEntity(Empleadora empleadora);

}
