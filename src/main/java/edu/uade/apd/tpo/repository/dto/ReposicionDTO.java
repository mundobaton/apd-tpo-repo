package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;

public class ReposicionDTO implements Serializable {

    private Long id;
    private ItemPedidoDTO itemPedido;
    private PedidoDTO pedido;
    private int cantidad;
    private char estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemPedidoDTO getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedidoDTO itemPedido) {
        this.itemPedido = itemPedido;
    }

    public PedidoDTO getPedido() {
        return pedido;
    }

    public void setPedido(PedidoDTO pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}
