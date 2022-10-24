package com.desafio.crud.data.repositories;

import com.desafio.crud.data.entities.EventoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<EventoEntity,Long> {
}
