package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.CondIvaStub;
import edu.uade.apd.tpo.repository.stub.PedidoStub;
import edu.uade.apd.tpo.repository.stub.RolStub;
import edu.uade.apd.tpo.repository.stub.ZonaStub;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

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

    public Long crearPedido(Long cuil, String calle, Long num, String cp, String loc, String prov, ZonaStub zona) throws RemoteException {
        return sistemaAdministracionRepository.crearPedido(cuil, calle, num, cp, loc, prov, zona);
    }

    public void agregarItemPedido(Long pedidoId, Long cuil, Long articuloId, int cant) throws RemoteException {
        sistemaAdministracionRepository.agregarItemPedido(pedidoId, cuil, articuloId, cant);
    }

    public void cerrarPedido(Long pedidoId, Long cuil) throws RemoteException {
        sistemaAdministracionRepository.cerrarPedido(pedidoId, cuil);
    }

    public void aprobarPedido(Long pedidoId, Long cuil, String motivo) throws RemoteException {
        sistemaAdministracionRepository.aprobarPedido(pedidoId, cuil, motivo);
    }

    public List<PedidoStub> obtenerPedidosParaAprobar() {
        return null;
    }
}
