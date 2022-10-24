package com.desafio.crud.services;

import com.desafio.crud.data.entities.EventoEntity;
import com.desafio.crud.data.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*El servicio se conecta a los repositorios que sean necesario,
 esto con el fin de aplicar la lógica de negocio en base a las */
@Service
public class EventoService {
    private EventoRepository eventoRepository;
    /*El autowired permite realizar la inyección de dependencias*/
    @Autowired
    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }
    public List<EventoEntity> listAll(){
        return eventoRepository.findAll();
    }
    public void save(EventoEntity eventoEntity){
        eventoRepository.save(eventoEntity);
    }
    public EventoEntity findById(Long idEvento){
        return eventoRepository.findById(idEvento).get();
    }
    public void delete(Long idEvento){
        eventoRepository.deleteById(idEvento);
    }
}
