package com.example.viaticosonline.servicios;

import com.example.viaticosonline.entidades.Empleado;
import com.example.viaticosonline.entidades.Viaje;
import com.example.viaticosonline.repositorios.RepositorioViaje;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiciosViaje implements Servicios<Viaje>{

    @Autowired
    RepositorioViaje repositorioViaje;
    @Override
    public List<Viaje> buscarTodos() throws Exception {
        try{
            List<Viaje> viajes = repositorioViaje.findAll();
            return viajes;

        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }

    @Override
    public Viaje buscarId(Integer id) throws Exception {
        try{
            Optional<Viaje> viajesId = repositorioViaje.findById(id);
            return viajesId.get();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Viaje registrar(Object entidad) throws Exception {
        return null;
    }
    @Override
    public Viaje editar(Integer id, Viaje entidad) throws Exception {
        try{
            Optional<Viaje>  buscarViaje = repositorioViaje.findById(id);
            Viaje viajes= buscarViaje.get();
            viajes =repositorioViaje.save(entidad);
            return viajes;
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
