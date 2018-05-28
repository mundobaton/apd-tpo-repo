package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

public interface SistemaDepositoRepository extends Remote {

    ArticuloStub buscarArticulo(Long articuloId);

    void completarPedido(Long pedidoId);

    void ingresarCompra(Long ordenId, List<ItemLoteStub> items) throws RemoteException;

    void almacenar(ArticuloStub articulo, List<ItemLoteStub> itemLotes, int cantidad) throws RemoteException;

    void aceptarOrdenCompra(Long ordenId) throws RemoteException;

    PosicionStub buscarPosicionPorUbicacion(String ubicacion);

    int liberarPosicion(String codUbicacion, int cantidad);

    List<ArticuloStub> obtenerArticulos();

    LoteStub crearLote(String codigo, Date fechaVen, Date fechaElab, Long idArticulo);

    List<PedidoStub> obtenerPedidosACompletar();
}
