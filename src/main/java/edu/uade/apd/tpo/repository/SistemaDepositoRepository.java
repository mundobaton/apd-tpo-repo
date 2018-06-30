package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.dto.ArticuloDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaDepositoRepository extends Remote {

    public List<ArticuloDTO> getArticulos() throws RemoteException;

}
