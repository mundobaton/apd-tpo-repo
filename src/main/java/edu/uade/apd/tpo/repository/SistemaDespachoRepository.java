package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.OrdenCompraStub;
import edu.uade.apd.tpo.repository.stub.PedidoStub;

import java.rmi.Remote;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public interface SistemaDespachoRepository extends Remote {

    List<OrdenCompraStub> obtenerOrdenesDeCompraEmitidas();

    PedidoStub buscarPedido(Long pedidoId);

    void despacharPedido(Long pedidoId);

    void alistarPedido(Long idPedido);

    List<PedidoStub> obtenerPedidosCompletos();

    void notificarFechaDeEnvioAsignada(Date fechaEnvio);

}
