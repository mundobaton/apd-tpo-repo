package edu.uade.apd.tpo.repository.stub;

public class CuentaCorrienteStub extends BaseStub {

    private Long id;
    private Float saldo;
    private Float limiteCredito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
