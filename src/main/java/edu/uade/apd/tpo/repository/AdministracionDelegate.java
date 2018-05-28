package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.*;

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

    public void eliminarItemPedido(Long pedidoId, Long articuloId) throws RemoteException {
        sistemaAdministracionRepository.eliminarItemPedido(pedidoId, articuloId);
    }

    public void crearArticulo(String codBarras, String descripcion, String presentacion, String unidad, int cantCompra, int volumen, float precio) throws RemoteException {
        sistemaAdministracionRepository.crearArticulo(codBarras, descripcion, presentacion, unidad, cantCompra, volumen, precio);
    }

    public void procesarPedidosPendientes() throws RemoteException {
        sistemaAdministracionRepository.procesarPedidosPendientes();
    }

    public List<ClienteStub> getClientes() throws RemoteException {
        return sistemaAdministracionRepository.getClientes();
    }

    public List<PedidoStub> obtenerPedidosPendientes() throws RemoteException {
        return sistemaAdministracionRepository.obtenerPedidosPendientes();
    }

}
