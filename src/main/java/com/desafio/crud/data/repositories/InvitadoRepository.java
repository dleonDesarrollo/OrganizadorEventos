package com.desafio.crud.data.repositories;

import com.desafio.crud.data.entities.InvitadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitadoRepository extends JpaRepository<InvitadoEntity,Long> {
}
