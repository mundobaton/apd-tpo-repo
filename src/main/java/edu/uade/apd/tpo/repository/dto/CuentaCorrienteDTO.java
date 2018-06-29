package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;
import java.util.List;

public class CuentaCorrienteDTO implements Serializable {

    private Long id;
    private float saldo;
    private float credito;
    private List<NotaDTO> notas;
    private List<FacturaDTO> facturas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public List<NotaDTO> getNotas() {
        return notas;
    }

    public void setNotas(List<NotaDTO> notas) {
        this.notas = notas;
    }

    public List<FacturaDTO> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<FacturaDTO> facturas) {
        this.facturas = facturas;
    }
}
