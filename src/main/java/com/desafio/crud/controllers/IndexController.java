package com.desafio.crud.controllers;

import com.desafio.crud.data.entities.EventoEntity;
import com.desafio.crud.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*El controlador nos permite entrelazarnos con la capa de presentación (Vista),
además gestiona las diferentes URLs con
los diferentes RequestMapping(POST,PUT,PATH,GET)*/
@Controller
public class IndexController {
    private EventoService eventoService;
    @Autowired
    public IndexController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @RequestMapping("/")
    public String callViewIndex(Model modelo){
        List<EventoEntity> listaEventos = eventoService.listAll();
        modelo.addAttribute("eventos",listaEventos);
        return "viewIndex";}

    @RequestMapping("/nuevo")
    public String callViewAdd(Model modelo){
        EventoEntity evento = new EventoEntity();
        modelo.addAttribute("evento",evento);
        return "viewAdd";}

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String saveEvent(@ModelAttribute("evento")EventoEntity evento){
        eventoService.save(evento);
        return "redirect:/";}

    @RequestMapping("/editar/{id}")
    public ModelAndView callViewEdit(@PathVariable(name = "id")Long id) {
        ModelAndView modelo = new ModelAndView("viewEdit");

        EventoEntity evento = eventoService.findById(id);
        modelo.addObject("evento", evento);
        return modelo;
    }

    @RequestMapping("/eliminar/{id}")
    public String deleteEvent(@PathVariable(name = "id")Long id){
        eventoService.delete(id);
        return "redirect:/";
    }
}
