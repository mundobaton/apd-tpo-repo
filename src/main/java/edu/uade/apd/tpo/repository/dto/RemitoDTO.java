package edu.uade.apd.tpo.repository.dto;

import java.io.Serializable;
import java.util.List;

public class RemitoDTO implements Serializable {

    private Long id;
    private List<ItemPedidoDTO> items;
    private DomicilioDTO domicilio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ItemPedidoDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemPedidoDTO> items) {
        this.items = items;
    }

    public DomicilioDTO getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioDTO domicilio) {
        this.domicilio = domicilio;
    }
}
