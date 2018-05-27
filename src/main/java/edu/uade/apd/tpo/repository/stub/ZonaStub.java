package edu.uade.apd.tpo.repository.stub;

public enum ZonaStub {

    CABA (3),
    NORTE (6),
    SUR (4),
    OESTE  (5);

    private float precio;

    ZonaStub (float precio){
        this.precio = precio;
    }

    public float getPrecio() {
        return this.precio;
    }
}
