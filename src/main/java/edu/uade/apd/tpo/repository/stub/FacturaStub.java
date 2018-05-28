package edu.uade.apd.tpo.repository.stub;

import java.util.Date;

public class FacturaStub extends BaseStub {

    private Long id;
    private Date fecha;
    private FacturaTipoStub tipo;
    private PedidoStub pedido;
    private float costoEnvio;
    private static float IMPUESTOS = 0.21f;
    private float total;

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

    public FacturaTipoStub getTipo() {
        return tipo;
    }

    public void setTipo(FacturaTipoStub tipo) {
        this.tipo = tipo;
    }

    public PedidoStub getPedido() {
        return pedido;
    }

    public void setPedido(PedidoStub pedido) {
        this.pedido = pedido;
    }

    public float getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(float costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public static float getIMPUESTOS() {
        return IMPUESTOS;
    }

    public static void setIMPUESTOS(float IMPUESTOS) {
        FacturaStub.IMPUESTOS = IMPUESTOS;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
