package edu.uade.apd.tpo.repository.stub;

import java.util.Date;

public class OrdenCompraStub extends BaseStub {

    private Long id;
    private ArticuloStub articulo;
    private EstadoCompraStub estado;
    private ProveedorStub proveedor;
    private Date fecha;
    private PedidoStub pedido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArticuloStub getArticulo() {
        return articulo;
    }

    public void setArticulo(ArticuloStub articulo) {
        this.articulo = articulo;
    }

    public EstadoCompraStub getEstado() {
        return estado;
    }

    public void setEstado(EstadoCompraStub estado) {
        this.estado = estado;
    }

    public ProveedorStub getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorStub proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public PedidoStub getPedido() {
        return pedido;
    }

    public void setPedido(PedidoStub pedido) {
        this.pedido = pedido;
    }
}
