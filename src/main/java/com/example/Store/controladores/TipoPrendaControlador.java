package com.example.Store.controladores;

import com.example.Store.Servicios.TipoPrendaServicio;
import com.example.Store.modelos.TipoPrenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping ("storeapi/v1/tipoPrenda")
public class TipoPrendaControlador {

    @Autowired
    TipoPrendaServicio tipoPrendaServicio;

    @PostMapping

    public ResponseEntity<?> guardarTipoPrenda(@RequestBody TipoPrenda datosTipoPrenda) {

        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(tipoPrendaServicio.guardarTipoPrenda(datosTipoPrenda));

        } catch (Exception error) {

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());


        }
    }

}



