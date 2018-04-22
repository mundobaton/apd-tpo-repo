package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;
import edu.uade.apd.tpo.repository.stub.DomicilioStub;
import edu.uade.apd.tpo.repository.stub.UsuarioStub;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaAdministracionRepository extends Remote {

    public void crearUsuario(String email, String password) throws RemoteException;

    public List<UsuarioStub> getUsuarios() throws RemoteException;
/*
    UsuarioStub login(String email, String password) throws RemoteException;

    ClienteStub crearCliente(String email, String password, DomicilioStub dom) throws RemoteException;
*/
}
