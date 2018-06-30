package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.dto.ClienteDTO;
import edu.uade.apd.tpo.repository.dto.RolDTO;
import edu.uade.apd.tpo.repository.dto.UsuarioDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SistemaAdministracionRepository extends Remote {

    void crearCliente(String nombreUsuario, String password, String calle, int numero, String localidad, String provincia, String codPostal, float saldo, float credito) throws RemoteException;

    void crearUsuario(String legajo, String password, RolDTO rol) throws RemoteException;

    ClienteDTO loginCliente(String email, String password) throws RemoteException;

    UsuarioDTO loginUsuario(String legajo, String password) throws RemoteException;
}
