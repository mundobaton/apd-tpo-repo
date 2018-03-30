package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClienteControllerRepository extends Remote {

    ClienteStub login(Long cuil, String password) throws RemoteException;

    void test(ClienteStub cliente) throws RemoteException;

}
