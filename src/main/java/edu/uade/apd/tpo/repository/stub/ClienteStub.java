package edu.uade.apd.tpo.repository.stub;

public class ClienteStub extends UsuarioStub {

    private String nombre;
    private DomicilioStub domicilio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DomicilioStub getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioStub domicilio) {
        this.domicilio = domicilio;
    }
}
