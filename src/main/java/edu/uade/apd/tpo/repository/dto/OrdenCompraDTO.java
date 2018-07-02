package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;
import java.util.Date;

public class OrdenCompraDTO implements Serializable {

    private Long id;
    private ItemPedidoDTO item;
    private PedidoDTO pedido;
    private char estado;
    private Date fechaCreacion;
    private String proveedor;
    private ReposicionDTO reposicion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemPedidoDTO getItem() {
        return item;
    }

    public void setItem(ItemPedidoDTO item) {
        this.item = item;
    }

    public PedidoDTO getPedido() {
        return pedido;
    }

    public void setPedido(PedidoDTO pedido) {
        this.pedido = pedido;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public ReposicionDTO getReposicion() {
        return reposicion;
    }

    public void setReposicion(ReposicionDTO reposicion) {
        this.reposicion = reposicion;
    }
}
