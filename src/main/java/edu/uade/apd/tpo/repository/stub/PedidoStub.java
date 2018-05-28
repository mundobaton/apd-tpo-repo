package edu.uade.apd.tpo.repository.stub;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoStub extends BaseStub {

    private Long id;
    private Date fechaPedido;
    private Date fechaEntrega;
    private Date fechaDespacho;
    private List<ItemPedidoStub> items;
    private List<EstadoStub> estados = new ArrayList<>();
    private FacturaStub factura;
    private EnvioStub envio;

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

    public List<ItemPedidoStub> getItems() {
        return items;
    }

    public void setItems(List<ItemPedidoStub> items) {
        this.items = items;
    }

    public EnvioStub getEnvio() {
        return envio;
    }

    public void setEnvio(EnvioStub envio) {
        this.envio = envio;
    }

    public List<EstadoStub> getEstados() {
        return estados;
    }

    public void setEstados(List<EstadoStub> estados) {
        this.estados = estados;
    }

    public FacturaStub getFactura() {
        return factura;
    }

    public void setFactura(FacturaStub factura) {
        this.factura = factura;
    }
}
