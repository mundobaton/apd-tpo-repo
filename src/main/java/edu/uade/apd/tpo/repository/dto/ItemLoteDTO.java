package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ItemLoteDTO implements Serializable {

    private Long id;
    private String codigo;
    private Date fechaVencimiento;
    private List<UbicacionDTO> ubicaciones;

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

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public List<UbicacionDTO> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<UbicacionDTO> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
}
