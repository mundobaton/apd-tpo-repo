package edu.uade.apd.tpo.repository.stub;

import java.util.Date;

public class RemitoStub extends BaseStub{

    private Long id;
    private Date fecha;

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
}
