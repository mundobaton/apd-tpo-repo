package edu.uade.apd.tpo.repository.delegate;

import edu.uade.apd.tpo.repository.SistemaAdministracionRepository;
import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;

import java.rmi.Naming;

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
        sistemaAdministracionRepository.crearCliente(nombreUsuario, password, calle, numero, localidad, provincia, codPostal, saldo, credito);
    }

}
