package com.desafio.crud.data.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class InvitadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invitado", nullable = false)
    private Long idInvitado;
    @Column(name = "correo",nullable = false)
    private String email;
}
