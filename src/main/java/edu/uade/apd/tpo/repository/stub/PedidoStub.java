package edu.uade.apd.tpo.repository.stub;

import java.util.Date;

public class PedidoStub extends BaseStub {

	private Long id;
	private Date fechaPedido;
	private EstadoPedidoStub estado;
	private ClienteStub cliente;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public ClienteStub getCliente() {
		return cliente;
	}
	
	 public EstadoPedidoStub getEstado() {
	        return estado;
	    }

}
