package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;

public enum EstadoPedidoDTO implements Serializable {
	
    GENERADO ("Generado"),
    PREAPROBADO ("Preaprobado"),
    SALDO_INSUFICIENTE ("Saldo insuficiente"),
    COMPLETO ("Completo"),
    RECHAZADO ("Rechazado"),
    A_FACTURAR ("A facturar"),
    PENDIENTE ("Pendiente"),
    FACTURADO ("Facturado");
	
	private String name;
	
	EstadoPedidoDTO(){
		
	}
	
	EstadoPedidoDTO (String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
