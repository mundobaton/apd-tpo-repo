package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.dto.PedidoDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaFacturacionRepository extends Remote {

    void facturar(Long pedidoId) throws RemoteException;

    void pagarFactura(Long facturaId, Float importe, Long clienteId) throws RemoteException;

    List<PedidoDTO> obtenerPedidosFacturar() throws RemoteException;

    void pagarImporte(Float importe, Long clienteId) throws RemoteException;

}
