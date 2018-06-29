package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;
import java.util.List;

public class ClienteDTO implements Serializable {

    private Long id;
    private String nombreUsuario;
    private String password;
    private CuentaCorrienteDTO cuentaCorriente;
    private DomicilioDTO domicilio;
    private List<PedidoDTO> pedidos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CuentaCorrienteDTO getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorrienteDTO cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public DomicilioDTO getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioDTO domicilio) {
        this.domicilio = domicilio;
    }

    public List<PedidoDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoDTO> pedidos) {
        this.pedidos = pedidos;
    }
}
