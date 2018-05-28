package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.FacturaStub;
import edu.uade.apd.tpo.repository.stub.MedioPagoStub;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface SistemaFacturacionRepository extends Remote {

    FacturaStub buscarFactura(Long facturaId);

    void facturar(Long pedidoId);

    float procesarPago(Long facturaId, float importe, MedioPagoStub mp, float saldo, float limiteCred);

    List<FacturaStub> obtenerFacturasImpagas(Long cuil);

    float procesarPagoImporte(Long cuil, float importe, MedioPagoStub mp, float saldo, float limiteCred);

}
