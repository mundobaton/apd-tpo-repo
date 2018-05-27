package edu.uade.apd.tpo.repository.stub;

import java.util.Date;

public class EstadoStub extends BaseStub {

    private Long id;
    private EstadoPedidoStub estado;
    private Date fecha;
    private String motivo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoPedidoStub getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedidoStub estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
