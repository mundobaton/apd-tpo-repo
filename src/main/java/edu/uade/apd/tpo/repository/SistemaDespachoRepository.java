package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.dto.PedidoDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaDespachoRepository extends Remote {

    void despacharPedido(Long pedidoId) throws RemoteException;

    List<PedidoDTO> obtenerPedidosCompletos() throws RemoteException;
}
