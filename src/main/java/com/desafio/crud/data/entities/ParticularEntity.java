package com.desafio.crud.data.entities;

public class ParticularEntity extends InvitadoEntity{
    private String rut;
    private String nombreParticular;

    public ParticularEntity() {

    }
    public ParticularEntity(Long idInvitado, String email, String rut, String nombreParticular) {
        super(idInvitado, email);
        this.rut = rut;
        this.nombreParticular = nombreParticular;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreParticular() {
        return nombreParticular;
    }

    public void setNombreParticular(String nombreParticular) {
        this.nombreParticular = nombreParticular;
    }
}
