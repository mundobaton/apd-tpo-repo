package edu.uade.apd.tpo.repository.stub;

import java.util.List;

public class ItemPedidoStub extends BaseStub {
    private Long id;
    private ArticuloStub articulo;
    private int cantidad;
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

    public List<ItemLoteStub> getLotes() {
        return lotes;
    }

    public void setLotes(List<ItemLoteStub> lotes) {
        this.lotes = lotes;
    }
}
