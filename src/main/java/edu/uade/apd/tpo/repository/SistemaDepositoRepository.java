package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.dto.ArticuloDTO;
import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;

import java.rmi.Remote;
import java.util.List;

public interface SistemaDepositoRepository extends Remote {

    public List<ArticuloDTO> getArticulos() throws RemoteBusinessException;

}
