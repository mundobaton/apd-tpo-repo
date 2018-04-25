package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;
import edu.uade.apd.tpo.repository.stub.DomicilioStub;
import edu.uade.apd.tpo.repository.stub.UsuarioStub;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaAdministracionRepository extends Remote {

    void crearUsuario(String email, String password) throws RemoteException;

    List<UsuarioStub> getUsuarios() throws RemoteException;

    List<ClienteStub> getClientes() throws RemoteException;

    void actualizarUsuario(UsuarioStub usuarioStub) throws RemoteException;

    void crearCliente(String email, String password, String nombre, long cuil, String telefono) throws RemoteException;

}
