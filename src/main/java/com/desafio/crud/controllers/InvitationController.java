package com.desafio.crud.controllers;

import com.desafio.crud.data.entities.EventoEntity;
import com.desafio.crud.data.entities.InvitadoEntity;
import com.desafio.crud.services.EventoService;
import com.desafio.crud.services.InvitadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InvitationController {
    private InvitadoService invitadoService;

    @Autowired
    public InvitationController(InvitadoService invitadoService) {
        this.invitadoService = invitadoService;
    }

    @RequestMapping("/invitados")
    public String callViewInvitation(Model modelo){
        List<InvitadoEntity> listaInvitados = invitadoService.listAll();
        modelo.addAttribute("invitados",listaInvitados);
        return "viewInvitation";}
}
