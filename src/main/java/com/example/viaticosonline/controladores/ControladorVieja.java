package com.example.viaticosonline.controladores;

import com.example.viaticosonline.entidades.Viaje;
import com.example.viaticosonline.servicios.ServiciosViaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/uribe/viajes")
public class ControladorVieja {

    @Autowired
    ServiciosViaje serviciosViaje;

    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody Viaje viaje){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(serviciosViaje.registrar(viaje));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje:error al registrar viaje}");

        }
    }
    @GetMapping
    public  ResponseEntity<?>buscarViaje(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(serviciosViaje.buscarTodos());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje:error al registar }");

        }
    }
}
