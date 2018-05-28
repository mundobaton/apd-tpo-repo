package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.OrdenCompraStub;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaComprasRepository extends Remote {

    void generarOrdenCompra(Long articuloId, Long pedidoId) throws RemoteException;

}
