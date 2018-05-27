package edu.uade.apd.tpo.repository.stub;

public enum TransportistaStub {
    OCA (20),
    CORREO_ARGENTINO (25),
    ANDREANI (28);

    private float precio;

    TransportistaStub(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return this.precio;
    }
}
