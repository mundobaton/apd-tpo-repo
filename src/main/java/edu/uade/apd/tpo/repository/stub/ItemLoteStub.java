package edu.uade.apd.tpo.repository.stub;

public class ItemLoteStub extends BaseStub{
    private Long id;
    private LoteStub lote;
    private int cantidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LoteStub getLote() {
        return lote;
    }

    public void setLote(LoteStub lote) {
        this.lote = lote;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
