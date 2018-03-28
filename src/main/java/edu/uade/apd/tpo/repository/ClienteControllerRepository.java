package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.model.Cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClienteControllerRepository extends Remote {

    Cliente login(Long cuil, String password) throws RemoteException;

}
