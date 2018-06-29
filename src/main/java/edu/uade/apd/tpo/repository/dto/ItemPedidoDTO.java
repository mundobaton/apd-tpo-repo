package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;
import java.util.List;

public class ItemPedidoDTO implements Serializable {

    private Long id;
    private ArticuloDTO articulo;
    private int cantidad;
    private List<ItemLoteDTO> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArticuloDTO getArticulo() {
        return articulo;
    }

    public void setArticulo(ArticuloDTO articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public List<ItemLoteDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemLoteDTO> items) {
        this.items = items;
    }
}
