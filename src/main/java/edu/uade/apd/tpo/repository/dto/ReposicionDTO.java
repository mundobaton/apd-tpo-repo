package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;

public class ReposicionDTO implements Serializable {

    private Long id;
    private OrdenCompraDTO ordenCompra;
    private int cantidad;
    private char estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrdenCompraDTO getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompraDTO ordenCompra) {
        this.ordenCompra = ordenCompra;
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
