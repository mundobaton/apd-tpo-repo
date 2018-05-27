package edu.uade.apd.tpo.repository.stub;

import java.util.Date;
import java.util.List;

public class TransaccionStub extends BaseStub{
    private Long id;
    private float importe;
    private Date fecha;
    private List<FacturaStub> facturas;
    private MedioPagoStub medioPago;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<FacturaStub> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<FacturaStub> facturas) {
        this.facturas = facturas;
    }

    public MedioPagoStub getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(MedioPagoStub medioPago) {
        this.medioPago = medioPago;
    }
}
