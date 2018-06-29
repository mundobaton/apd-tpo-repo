package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;

public enum EstadoPedidoDTO implements Serializable {

    GENERADO,
    PREAPROBADO,
    SALDO_INSUFICIENTE,
    COMPLETO,
    RECHAZADO,
    A_FACTURAR,
    PENDIENTE,
    FACTURADO;
}
