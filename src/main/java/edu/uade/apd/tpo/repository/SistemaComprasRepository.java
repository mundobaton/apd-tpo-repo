package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.dto.OrdenCompraDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaComprasRepository extends Remote {

    void procesarOrdenCompra(Long ordenCompraId) throws RemoteException;

    void procesarOrdenesCompra() throws RemoteException;

    List<OrdenCompraDTO> getOrdenesCompra() throws RemoteException;

    OrdenCompraDTO findById(Long ordenCompraId) throws RemoteException;

}
