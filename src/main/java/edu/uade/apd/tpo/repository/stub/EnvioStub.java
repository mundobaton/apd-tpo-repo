package edu.uade.apd.tpo.repository.stub;

public class EnvioStub extends BaseStub {
    private Long id;
    private DomicilioStub domicilio;
    private TransportistaStub transportista;
    private RemitoStub remito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DomicilioStub getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioStub domicilio) {
        this.domicilio = domicilio;
    }

    public TransportistaStub getTransportista() {
        return transportista;
    }

    public void setTransportista(TransportistaStub transportista) {
        this.transportista = transportista;
    }

    public RemitoStub getRemito() {
        return remito;
    }

    public void setRemito(RemitoStub remito) {
        this.remito = remito;
    }
}
