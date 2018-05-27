package edu.uade.apd.tpo.repository.stub;

public class PosicionStub extends BaseStub {

    private Long id;
    private String codUbicacion;
    private EstadoPosicionStub estado;
    private LoteStub lote;
    private int cantidad;
    private char calle;
    private int bloque;
    private int estanteria;
    private int estante;
    private int numero;
    private static int CAPACIDAD = 100;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodUbicacion() {
        return codUbicacion;
    }

    public void setCodUbicacion(String codUbicacion) {
        this.codUbicacion = codUbicacion;
    }

    public EstadoPosicionStub getEstado() {
        return estado;
    }

    public void setEstado(EstadoPosicionStub estado) {
        this.estado = estado;
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

    public char getCalle() {
        return calle;
    }

    public void setCalle(char calle) {
        this.calle = calle;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public int getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(int estanteria) {
        this.estanteria = estanteria;
    }

    public int getEstante() {
        return estante;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getCAPACIDAD() {
        return CAPACIDAD;
    }
    
}
