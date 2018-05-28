package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;
import edu.uade.apd.tpo.repository.stub.CondIvaStub;
import edu.uade.apd.tpo.repository.stub.RolStub;
import edu.uade.apd.tpo.repository.stub.ZonaStub;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class AdministracionDelegate {

    private static AdministracionDelegate instance;

    private SistemaAdministracionRepository sistemaAdministracionRepository;

    public static AdministracionDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new AdministracionDelegate();
        }
        return instance;
    }

    private AdministracionDelegate() throws Exception {
        sistemaAdministracionRepository = (SistemaAdministracionRepository) Naming.lookup("//127.0.0.1/administracion");
    }

    public void crearUsuario(String email, String password, RolStub rol) throws RemoteException {
        sistemaAdministracionRepository.crearUsuario(email, password, rol);
    }

    public void crearCliente(Long cuil, String email, String password, String nombre, String telefono, String calle,
                             Long num, String cp, String loc, String prov, CondIvaStub condIva, ZonaStub zona, float saldo,
                             float limiteCredito) throws RemoteException {
        sistemaAdministracionRepository.crearCliente(cuil, email, password, nombre,
                telefono, calle, num, cp, loc, prov, condIva, zona, saldo, limiteCredito);

    }

    public void crearPedido(Long cuil, String calle, Long num, String cp, String loc, String prov, ZonaStub zona) throws RemoteException {
        sistemaAdministracionRepository.crearPedido(cuil, calle, num, cp, loc, prov, zona);
    }
}
