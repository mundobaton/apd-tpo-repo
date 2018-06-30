package edu.uade.apd.tpo.repository.delegate;

import edu.uade.apd.tpo.repository.SistemaComprasRepository;
import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class ComprasDelegate {

    private static ComprasDelegate instance;
    private SistemaComprasRepository sistemaComprasRepository;

    private ComprasDelegate() throws Exception {
        sistemaComprasRepository = (SistemaComprasRepository) Naming.lookup("//127.0.0.1/compras");
    }

    public static ComprasDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new ComprasDelegate();
        }
        return instance;
    }

    public void procesarOrdenCompra(Long ordenCompraId) throws RemoteBusinessException {
        try {
            sistemaComprasRepository.procesarOrdenCompra(ordenCompraId);
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.getMessage());
        }
    }

    public void procesarOrdenesCompra() throws RemoteBusinessException {
        try {
            sistemaComprasRepository.procesarOrdenesCompra();
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.getMessage());
        }
    }

}
