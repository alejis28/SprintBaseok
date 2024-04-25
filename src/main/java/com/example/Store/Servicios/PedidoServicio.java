package com.example.Store.Servicios;
import com.example.Store.Repositorios.PedidoRepositorio;
import com.example.Store.helpers.ValidacionPedido;
import com.example.Store.modelos.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PedidoServicio {



    @Autowired
    ValidacionPedido validacionPedido;
    @Autowired
    PedidoRepositorio pedidoRepositorio;


    public Pedido guardarPedido(Pedido datosPedido) throws Exception{

        if(!validacionPedido.validarFechaYHora(datosPedido.getFechaYHora())){

            throw new Exception("Fecha y hora no valida");

        }

        try {

            return pedidoRepositorio.save(datosPedido);
        }catch(Exception e){

            throw new Exception("Error al guardar la fecha: " + e.getMessage());

        }

        }



    public Pedido buscarPedidoPorId(){

        return null;
    }


    public List<Pedido> buscarTodosLosPedido (){

        return null;

    }


    public Pedido modificarPedido (){

        return null;

    }

    public boolean eliminarPedido (){

        return true;

    }
}
