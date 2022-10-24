package com.desafio.crud.data.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/*Aquí tenemos anotaciones que pertenecen a la librería LOMBOOK, ésta se utiliza
con el fin de automatizar nuestro código con configuraciones internas*/
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class EventoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long idEvento;
    @Column(name = "fecha",nullable = false)
    private String dateEvent;
    @Column(name = "titulo",nullable = false, length = 100)
    private String title;
    @Column(name = "descripcion",nullable = false, length = 200)
    private String description;
}
