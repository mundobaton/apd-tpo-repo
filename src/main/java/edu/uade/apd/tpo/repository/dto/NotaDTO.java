package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;

public class NotaDTO implements Serializable {

    private Long id;
    private String mensaje;
    private PedidoDTO pedido;

    public String getMensaje() {
        return mensaje;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public PedidoDTO getPedido() {
        return pedido;
    }

    public void setPedido(PedidoDTO pedido) {
        this.pedido = pedido;
    }
}
