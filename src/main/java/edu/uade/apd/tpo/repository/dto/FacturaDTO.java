package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;

public class FacturaDTO implements Serializable {

    private Long id;
    private char tipo;
    private PedidoDTO pedido;
    private Float total;
    private char estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public PedidoDTO getPedido() {
        return pedido;
    }

    public void setPedido(PedidoDTO pedido) {
        this.pedido = pedido;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}
