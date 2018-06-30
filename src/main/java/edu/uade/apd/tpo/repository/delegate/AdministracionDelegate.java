package edu.uade.apd.tpo.repository.delegate;

import edu.uade.apd.tpo.repository.SistemaAdministracionRepository;
import edu.uade.apd.tpo.repository.dto.ClienteDTO;
import edu.uade.apd.tpo.repository.dto.RolDTO;
import edu.uade.apd.tpo.repository.dto.UsuarioDTO;
import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class AdministracionDelegate {

    public static AdministracionDelegate instance;
    private SistemaAdministracionRepository sistemaAdministracionRepository;

    private AdministracionDelegate() throws Exception {
        sistemaAdministracionRepository = (SistemaAdministracionRepository) Naming.lookup("//127.0.0.1/administracion");
    }

    public static AdministracionDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new AdministracionDelegate();
        }
        return instance;
    }

    public void crearCliente(String nombreUsuario, String password, String calle, int numero, String localidad, String provincia, String codPostal, float saldo, float credito) throws RemoteBusinessException {
        try {
            sistemaAdministracionRepository.crearCliente(nombreUsuario, password, calle, numero, localidad, provincia, codPostal, saldo, credito);
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.getMessage());
        }

    }

    public void crearUsuario(String legajo, String password, RolDTO rol) throws RemoteBusinessException {
        try {
            sistemaAdministracionRepository.crearUsuario(legajo, password, rol);
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.getMessage());
        }

    }

    public ClienteDTO loginCliente(String email, String password) throws RemoteBusinessException {
        try {
            return sistemaAdministracionRepository.loginCliente(email, password);
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.getMessage());
        }
    }

    public UsuarioDTO loginUsuario(String legajo, String password) throws RemoteBusinessException {
        try {
            return sistemaAdministracionRepository.loginUsuario(legajo, password);
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.getMessage());
        }

    }

}
