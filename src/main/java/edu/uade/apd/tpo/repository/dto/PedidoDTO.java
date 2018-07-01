package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PedidoDTO implements Serializable {

    private Long id;
    private DomicilioDTO domicilio;
    private List<ItemPedidoDTO> items;
    private ClienteDTO cliente;
    private Date fechaPedido;
    private Date fechaDespacho;
    private EstadoPedidoDTO estado;
    private Float precioBruto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DomicilioDTO getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioDTO domicilio) {
        this.domicilio = domicilio;
    }

    public List<ItemPedidoDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemPedidoDTO> items) {
        this.items = items;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(Date fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public EstadoPedidoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedidoDTO estado) {
        this.estado = estado;
    }

    public Float getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(Float precioBruto) {
        this.precioBruto = precioBruto;
    }
}
