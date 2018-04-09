package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;
import edu.uade.apd.tpo.repository.stub.DomicilioStub;
import edu.uade.apd.tpo.repository.stub.UsuarioStub;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SistemaAdministracionRepository extends Remote {

    UsuarioStub login(String email, String password) throws RemoteException;

    ClienteStub crearCliente(String email, String password, DomicilioStub dom) throws RemoteException;

}
