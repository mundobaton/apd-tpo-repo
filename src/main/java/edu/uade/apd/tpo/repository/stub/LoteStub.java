package edu.uade.apd.tpo.repository.stub;

import java.util.Date;
import java.util.List;

public class LoteStub extends BaseStub {

    private Long id;
    private String codigo;
    private Date fechaVto;
    private Date fechaElaboracion;
    private List<PosicionStub> posiciones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(Date fechaVto) {
        this.fechaVto = fechaVto;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public List<PosicionStub> getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(List<PosicionStub> posiciones) {
        this.posiciones = posiciones;
    }
}
