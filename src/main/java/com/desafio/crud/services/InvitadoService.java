package com.desafio.crud.services;

import com.desafio.crud.data.entities.InvitadoEntity;
import com.desafio.crud.data.repositories.InvitadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitadoService {
    private InvitadoRepository invitadoRepository;
    @Autowired
    public InvitadoService(InvitadoRepository invitadoRepository) {
        this.invitadoRepository = invitadoRepository;
    }
    public List<InvitadoEntity> listAll(){
        return invitadoRepository.findAll();
    }
    public void save(InvitadoEntity invitadoEntity){
        invitadoRepository.save(invitadoEntity);
    }
    public InvitadoEntity findById(Long idInvitado){
        return invitadoRepository.findById(idInvitado).get();
    }
    public void delete(Long idInvitado){
        invitadoRepository.deleteById(idInvitado);
    }
}
