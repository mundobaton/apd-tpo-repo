package edu.uade.apd.tpo.repository.stub;

import java.util.List;

public class CuentaCorrienteStub extends BaseStub {

    private Long id;
    private float saldo;
    private float limiteCredito;
    private List<TransaccionStub> transacciones;

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

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public List<TransaccionStub> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<TransaccionStub> transacciones) {
        this.transacciones = transacciones;
    }
}
