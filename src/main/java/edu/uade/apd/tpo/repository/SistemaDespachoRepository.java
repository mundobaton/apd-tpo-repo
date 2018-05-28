package edu.uade.apd.tpo.repository;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SistemaDespachoRepository extends Remote {

    void alistarPedido(Long pedidoId) throws RemoteException;

    void despacharPedido(Long pedidoId) throws RemoteException;

}
