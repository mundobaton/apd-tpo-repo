package edu.uade.apd.tpo.repository.stub;

public class ItemPosicionStub {

    private Long id;
    private int cantidad;
    private PosicionStub posicion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public PosicionStub getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionStub posicion) {
        this.posicion = posicion;
    }

}
