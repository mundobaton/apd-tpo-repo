package edu.uade.apd.tpo.repository;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SistemaFacturacionRepository extends Remote {

    void facturar(Long pedidoId) throws RemoteException;

    void pagarFactura(Long facturaId, Float importe) throws RemoteException;

}
