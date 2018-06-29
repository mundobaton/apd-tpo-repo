package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {

    private Long id;
    private String legajo;
    private String password;
    private RolDTO rol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RolDTO getRol() {
        return rol;
    }

    public void setRol(RolDTO rol) {
        this.rol = rol;
    }

}
