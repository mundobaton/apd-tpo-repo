package edu.uade.apd.tpo.repository;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SistemaComprasRepository extends Remote {

    void procesarOrdenCompra(Long ordenCompraId) throws RemoteException;

    void procesarOrdenesCompra() throws RemoteException;

}
