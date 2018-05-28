package edu.uade.apd.tpo.repository.stub;

import java.util.List;

public class ClienteStub extends UsuarioStub {

    private String nombre;
    private Long cuil;
    private String telefono;
    private DomicilioStub domicilio;
    private CondIvaStub condIva;
    private CuentaCorrienteStub cuentaCorriente;
    private List<PedidoStub> pedidos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCuil() {
        return cuil;
    }

    public void setCuil(Long cuil) {
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

    public CondIvaStub getCondIva() {
        return condIva;
    }

    public void setCondIva(CondIvaStub condIva) {
        this.condIva = condIva;
    }

    public CuentaCorrienteStub getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorrienteStub cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public List<PedidoStub> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoStub> pedidos) {
        this.pedidos = pedidos;
    }
}
