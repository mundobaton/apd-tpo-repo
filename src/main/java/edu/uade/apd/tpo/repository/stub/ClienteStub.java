package edu.uade.apd.tpo.repository.stub;

public class ClienteStub extends UsuarioStub {

    private String nombre;
    private long cuil;
    private String telefono;
    private DomicilioStub domicilio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public DomicilioStub getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioStub domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Nombre:");
        sb.append(nombre);
        sb.append(",Cuil:");
        sb.append(cuil);
        sb.append(",Email:");
        sb.append(email);
        sb.append(",Password:");
        sb.append(password);
        sb.append("]");
        return sb.toString();
    }
}
