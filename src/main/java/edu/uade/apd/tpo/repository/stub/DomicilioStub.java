package edu.uade.apd.tpo.repository.stub;

public class DomicilioStub extends BaseStub {

    private Long id;
    private String calle;
    private Long numero;
    private String codPostal;
    private String localidad;
    private String provincia;
    private ZonaStub zona;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public ZonaStub getZona() {
        return zona;
    }

    public void setZona(ZonaStub zona) {
        this.zona = zona;
    }
}
