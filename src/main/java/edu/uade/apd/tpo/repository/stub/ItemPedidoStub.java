package edu.uade.apd.tpo.repository.stub;

import java.util.List;

public class ItemPedidoStub extends BaseStub {
    private Long id;
    private ArticuloStub articulo;
    private int cantidad;
    private float subTotal;
    private List<ItemLoteStub> lotes;

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public List<ItemLoteStub> getLotes() {
        return lotes;
    }

    public void setLotes(List<ItemLoteStub> lotes) {
        this.lotes = lotes;
    }
}
