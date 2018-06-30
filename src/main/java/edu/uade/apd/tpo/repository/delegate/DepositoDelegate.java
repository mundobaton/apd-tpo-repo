package edu.uade.apd.tpo.repository.delegate;

import edu.uade.apd.tpo.repository.SistemaDepositoRepository;
import edu.uade.apd.tpo.repository.dto.ArticuloDTO;
import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

public class DepositoDelegate {

    private static DepositoDelegate instance;
    private SistemaDepositoRepository sistemaDepositoRepository;

    private DepositoDelegate() throws Exception {
        sistemaDepositoRepository = (SistemaDepositoRepository) Naming.lookup("//127.0.0.1/deposito");
    }

    public static DepositoDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new DepositoDelegate();
        }
        return instance;
    }

    public List<ArticuloDTO> getArticulos() throws RemoteBusinessException {
        try {
            return sistemaDepositoRepository.getArticulos();
        } catch (RemoteException re) {
            throw new RemoteBusinessException(re.getMessage());
        }

    }

}
