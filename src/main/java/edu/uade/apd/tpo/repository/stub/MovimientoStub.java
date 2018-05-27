package edu.uade.apd.tpo.repository.stub;

import java.util.Date;

public abstract class MovimientoStub extends BaseStub{

    protected Long id;
    protected Date fecha;
    protected int cantidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
