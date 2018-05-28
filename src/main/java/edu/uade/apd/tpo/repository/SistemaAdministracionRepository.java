package edu.uade.apd.tpo.repository;


import edu.uade.apd.tpo.repository.stub.*;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SistemaAdministracionRepository extends Remote {

    void crearUsuario(String email, String password, RolStub rol) throws RemoteException;


    void crearCliente(Long cuil, String email, String password, String nombre, String telefono, String calle,
                      Long num, String cp, String loc, String prov, CondIvaStub condIva, ZonaStub zona, float saldo,
                      float limiteCredito) throws RemoteException;

    Long crearPedido (Long cuil, String calle, Long num, String cp, String loc, String prov, ZonaStub zona) throws RemoteException;

    void agregarItemPedido(Long pedidoId, Long cuil, Long articuloId, int cant) throws RemoteException;

    void cerrarPedido(Long pedidoId, Long cuil) throws RemoteException;

    void aprobarPedido(Long pedidoId, Long cuil, String motivo) throws RemoteException;

}
