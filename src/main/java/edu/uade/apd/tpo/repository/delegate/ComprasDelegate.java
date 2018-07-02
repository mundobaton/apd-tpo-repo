package edu.uade.apd.tpo.repository.delegate;

import edu.uade.apd.tpo.repository.SistemaComprasRepository;
import edu.uade.apd.tpo.repository.dto.OrdenCompraDTO;
import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

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
            throw new RemoteBusinessException(re.detail.getMessage());
        }
    }

    public void procesarOrdenesCompra() throws RemoteBusinessException {
        try {
            sistemaComprasRepository.procesarOrdenesCompra();
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.detail.getMessage());
        }
    }

    public List<OrdenCompraDTO> obtenerOrdenesCompra() throws RemoteBusinessException {
        try {
            return sistemaComprasRepository.getOrdenesCompra();
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.detail.getMessage());
        }
    }

    public OrdenCompraDTO obtenerPorId(Long ordenCompraId) throws RemoteBusinessException {
        try {
            return sistemaComprasRepository.findById(ordenCompraId);
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.detail.getMessage());
        }
    }
}
