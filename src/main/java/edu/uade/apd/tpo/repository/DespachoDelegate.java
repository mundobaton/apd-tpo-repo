package edu.uade.apd.tpo.repository;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class DespachoDelegate {
    private static DespachoDelegate instance;

    private SistemaDespachoRepository sistemaDespachoRepository;

    public static DespachoDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new DespachoDelegate();
        }
        return instance;
    }

    private DespachoDelegate() throws Exception {
        sistemaDespachoRepository = (SistemaDespachoRepository) Naming.lookup("//127.0.0.1/despacho");
    }

    public void alistarPedido(Long pedidoId) throws RemoteException {
        sistemaDespachoRepository.alistarPedido(pedidoId);
    }

    public void despacharPedido(Long pedidoId) throws RemoteException {
        sistemaDespachoRepository.despacharPedido(pedidoId);
    }
}
