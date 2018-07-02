package edu.uade.apd.tpo.repository.delegate;

import edu.uade.apd.tpo.repository.SistemaFacturacionRepository;
import edu.uade.apd.tpo.repository.dto.PedidoDTO;
import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

public class FacturacionDelegate {

    private static FacturacionDelegate instance;
    private SistemaFacturacionRepository sistemaFacturacionRepository;

    private FacturacionDelegate() throws Exception {
        this.sistemaFacturacionRepository = (SistemaFacturacionRepository) Naming.lookup("//127.0.0.1/facturacion");
    }

    public static FacturacionDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new FacturacionDelegate();
        }
        return instance;
    }

    public void facturar(Long pedidoId) throws RemoteBusinessException {
        try {
            sistemaFacturacionRepository.facturar(pedidoId);
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.detail.getMessage());
        }

    }

    public void pagarFactura(Long facturaId, Float importe, Long clienteId) throws RemoteBusinessException {
        try {
            sistemaFacturacionRepository.pagarFactura(facturaId, importe, clienteId);
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.detail.getMessage());
        }
    }

    public List<PedidoDTO> obtenerPedidosFacturar() throws RemoteBusinessException {
        try {
            return sistemaFacturacionRepository.obtenerPedidosFacturar();
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.detail.getMessage());
        }
    }

    public void pagarImporte(Float importe, Long clienteId) throws RemoteBusinessException {
        try {
            sistemaFacturacionRepository.pagarImporte(importe, clienteId);
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.detail.getMessage());
        }
    }

}
