package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;
import edu.uade.apd.tpo.repository.stub.CondIvaStub;
import edu.uade.apd.tpo.repository.stub.PedidoStub;
import edu.uade.apd.tpo.repository.stub.RolStub;
import edu.uade.apd.tpo.repository.stub.UsuarioStub;
import edu.uade.apd.tpo.repository.stub.ZonaStub;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaAdministracionRepository extends Remote {

    void crearUsuario(String email, String password, RolStub rol) throws RemoteException;

    List<UsuarioStub> getUsuarios() throws RemoteException;

    List<ClienteStub> getClientes() throws RemoteException;

    void actualizarUsuario(UsuarioStub usuarioStub) throws RemoteException;

    void crearCliente(String email, String password, String nombre, long cuil, String telefono, CondIvaStub condIva, String calle, int numero, String codPostal, String localidad, String provincia, ZonaStub zona, float saldo, float limiteCredito) throws RemoteException;

    void generarPedido(String email, String calle, int num, String codPostal, String localidad, String prov, ZonaStub zona) throws RemoteException;

    void agregarItemPedido(Long pedidoId, Long articuloId, int cant)  throws RemoteException;

    List<PedidoStub> getPedidosPendientes() throws RemoteException;

}
