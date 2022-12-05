package com.example.viaticosonline.servicios;

import java.util.List;

public interface Servicios <E>{
    public List<E> buscarTodos() throws Exception;
    public  E buscarId(Integer id) throws  Exception;
    public  E registrar(Object entidad) throws Exception;
    public  E editar(Integer id, E entidad) throws Exception;

}
