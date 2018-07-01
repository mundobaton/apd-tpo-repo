package edu.uade.apd.tpo.repository.delegate;

import edu.uade.apd.tpo.repository.SistemaDespachoRepository;
import edu.uade.apd.tpo.repository.dto.PedidoDTO;
import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

public class DespachoDelegate {

    private static DespachoDelegate instance;
    private SistemaDespachoRepository sistemaDespachoRepository;

    private DespachoDelegate() throws Exception {
        this.sistemaDespachoRepository = (SistemaDespachoRepository) Naming.lookup("//127.0.0.1/despacho");
    }

    public static DespachoDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new DespachoDelegate();
        }
        return instance;
    }

    public void despacharPedido(Long pedidoId) throws RemoteBusinessException {
        try {
            sistemaDespachoRepository.despacharPedido(pedidoId);
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.getMessage());
        }
    }

    public List<PedidoDTO> obtenerPedidosCompletos() throws RemoteBusinessException {
        try {
            return sistemaDespachoRepository.obtenerPedidosCompletos();
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.getMessage());
        }
    }
}
