package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.exception.UserNotFoundException;
import edu.uade.apd.tpo.repository.stub.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaAdministracionRepository extends Remote {


    List<UsuarioStub> getUsuarios();

    void actualizarUsuario(UsuarioStub u);

    List<ClienteStub> getClientes();

    List<PedidoStub> obtenerPedidosParaAprobar();

    ClienteStub buscarCliente(Long cuil);

    ClienteStub buscarCliente(String email) throws RemoteException;

    void crearUsuario(String email, String password, RolStub rol);

    List<ArticuloStub> obtenerArticulos();

    void crearCliente(Long cuil, String email, String password, String nombre, String telefono, String calle,
                             Long num, String cp, String loc, String prov, CondIvaStub condIva, ZonaStub zona, float saldo,
                             float limiteCredito) throws RemoteException;

    PedidoStub generarPedido(Long cuil, String calle, Long num, String cp, String loc, String prov, ZonaStub zona) throws RemoteException;

    PedidoStub buscarPedido(Long pedidoId);

    void agregarItemPedido(Long pedidoId, Long articuloId, int cant) throws RemoteException;

    void notificarClienteEstadoPedido(Long pedidoId) throws RemoteException;

    void cerrarPedido(Long pedidoId) throws RemoteException;

    void aprobarPedido(Long pedidoId) throws RemoteException;

    void realizarPago(Long facturaId, float importe, MedioPagoStub mp) throws RemoteException;

    void realizarPagoImporte(Long cuil, float importe, MedioPagoStub mp) throws RemoteException;

    void rechazarPedido(Long pedidoId, String motivo) throws RemoteException;

    UsuarioStub login(String email, String password) throws UserNotFoundException;

    void eliminarItemPedido(Long pedidoId, Long articuloId) throws RemoteException;

    List<PedidoStub> obtenerPedidoCompletos();

    List<PedidoStub> obtenerPedidosListos();

    List<PedidoStub> obtenerPedidosACompletar();

}
