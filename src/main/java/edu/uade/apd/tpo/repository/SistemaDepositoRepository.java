package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.dto.ArticuloDTO;
import edu.uade.apd.tpo.repository.dto.ReposicionDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SistemaDepositoRepository extends Remote {

    List<ArticuloDTO> getArticulos() throws RemoteException;

    ArticuloDTO findArticuloById(Long articuloId) throws RemoteException;

    List<ReposicionDTO> getReposiciones() throws RemoteException;

    void reponer(Long reposicionId, int cant) throws RemoteException;

}
