package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public interface SistemaDepositoRepository extends Remote {

    void completarPedido(Long pedidoId) throws RemoteException;

}
