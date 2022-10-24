package com.desafio.crud.controllers.restController;

import com.desafio.crud.data.entities.EventoEntity;
import com.desafio.crud.services.EventoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/eventos-creados")
public class EventoRestController {
    private EventoService eventoService;
    @Autowired
    public EventoRestController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping()
    public List<EventoEntity> callAllEvent(){
        return eventoService.listAll();
    }
}
