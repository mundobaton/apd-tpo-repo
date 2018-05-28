package edu.uade.apd.tpo.repository;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class ComprasDelegate {

    private static ComprasDelegate instance;

    private SistemaComprasRepository sistemaComprasRepository;

    public static ComprasDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new ComprasDelegate();
        }
        return instance;
    }

    private ComprasDelegate() throws Exception {
        sistemaComprasRepository = (SistemaComprasRepository) Naming.lookup("//127.0.0.1/compras");
    }

    public void generarOrdenCompra(Long articuloId, Long pedidoId) throws RemoteException {
        sistemaComprasRepository.generarOrdenCompra(articuloId, pedidoId);
    }

    public void aceptarOrdenCompra(Long ordenCompraId) throws RemoteException {
        sistemaComprasRepository.aceptarOrdenCompra(ordenCompraId);
    }
}
