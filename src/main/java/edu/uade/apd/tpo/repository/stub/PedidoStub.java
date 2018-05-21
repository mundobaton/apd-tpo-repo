package edu.uade.apd.tpo.repository.stub;

import java.util.Date;
import java.util.List;

public class PedidoStub extends BaseStub {

    private Long id;
    private Date fechaPedido;
    private Date fechaEntrega;
    private Date fechaDespacho;
    //private List<ItemPedido> items;
    private ClienteStub cliente;
    private DomicilioStub domicilio;
    private List<EstadoStub> estados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(Date fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public ClienteStub getCliente() {
        return cliente;
    }

    public void setCliente(ClienteStub cliente) {
        this.cliente = cliente;
    }

    public DomicilioStub getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioStub domicilio) {
        this.domicilio = domicilio;
    }

    public List<EstadoStub> getEstados() {
        return estados;
    }

    public void setEstados(List<EstadoStub> estados) {
        this.estados = estados;
    }
}
