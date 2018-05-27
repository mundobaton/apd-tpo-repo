package edu.uade.apd.tpo.repository.stub;

public class EgresoStub extends MovimientoStub {

    private MotivoEgresoStub motivo;
    private UsuarioStub encargado;
    private String autorizante;
    private String destino;

    public MotivoEgresoStub getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoEgresoStub motivo) {
        this.motivo = motivo;
    }

    public UsuarioStub getEncargado() {
        return encargado;
    }

    public void setEncargado(UsuarioStub encargado) {
        this.encargado = encargado;
    }

    public String getAutorizante() {
        return autorizante;
    }

    public void setAutorizante(String autorizante) {
        this.autorizante = autorizante;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}