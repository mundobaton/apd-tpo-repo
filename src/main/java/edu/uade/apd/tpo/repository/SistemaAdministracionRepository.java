package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.dto.ClienteDTO;
import edu.uade.apd.tpo.repository.dto.RolDTO;
import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;

import java.rmi.Remote;

public interface SistemaAdministracionRepository extends Remote {

    void crearCliente(String nombreUsuario, String password, String calle, int numero, String localidad, String provincia, String codPostal, float saldo, float credito) throws RemoteBusinessException;

    void crearUsuario(String legajo, String password, RolDTO rol) throws RemoteBusinessException;

    ClienteDTO login(String email, String password) throws RemoteBusinessException;

}
