package com.empresa.multiserviciosantarosa.infraestructura.rest.controller;

import com.empresa.multiserviciosantarosa.aplicacion.usecase.EmpleadoraUseCase;
import com.empresa.multiserviciosantarosa.infraestructura.rest.controller.dto.EmpleadoraDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/empleadoras")
@AllArgsConstructor
public class EmpleadoraController {

    private final EmpleadoraUseCase empleadoraUseCase;

    @GetMapping("/obtenerEmpleadoraById/{id}")
    public ResponseEntity<EmpleadoraDTO> getEmpleadoraById(@PathVariable("id") Long id) {
        var empleadora = empleadoraUseCase.obtenerEmpleadoraPorId(id);
        return ResponseEntity.ok(empleadora);
    }
}
