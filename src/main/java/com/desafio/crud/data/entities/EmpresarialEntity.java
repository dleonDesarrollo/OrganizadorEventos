package com.desafio.crud.data.entities;


public class EmpresarialEntity extends InvitadoEntity{
    private String rutEmpresa;
    private String nombreEmpresa;
    private String maxInvitados;

    public EmpresarialEntity() {
    }

    public EmpresarialEntity(Long idInvitado, String email, String rutEmpresa, String nombreEmpresa, String maxInvitados) {
        super(idInvitado, email);
        this.rutEmpresa = rutEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.maxInvitados = maxInvitados;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getMaxInvitados() {
        return maxInvitados;
    }

    public void setMaxInvitados(String maxInvitados) {
        this.maxInvitados = maxInvitados;
    }
}
