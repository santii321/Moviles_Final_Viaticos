package com.example.viaticosonline.controladores;

import com.example.viaticosonline.entidades.Empleado;
import com.example.viaticosonline.servicios.ServiciosEmpleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/uribe/empelado")
public class ControladorEmpleado {

    @Autowired
    ServiciosEmpleados serviciosEmpleados;

    @PostMapping
    public ResponseEntity<?> registar(@RequestBody Empleado empleado){
        try{
    return ResponseEntity
            .status(HttpStatus.OK)
            .body(serviciosEmpleados.registrar(empleado));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje:Error al registrar empelado...}");
        }
    }
    @GetMapping
    public ResponseEntity<?> buscarEmpleado(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(serviciosEmpleados.buscarTodos());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje:Error al registrar empelado...}");
        }
    }
}
