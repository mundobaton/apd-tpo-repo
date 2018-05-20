package edu.uade.apd.tpo.repository.stub;

import java.util.Arrays;

import edu.uade.apd.tpo.repository.stub.ZonaEnvioStub;

public enum ZonaEnvioStub {

    CABA("Caba"),
    NORTE("Norte"),
    SUR("Sur"),
    OESTE("Oeste");

    private String value;

    ZonaEnvioStub(String val) {
            this.value = val;
    }

    public static ZonaEnvioStub getZonaFromValue(String value) {
        return Arrays.asList(ZonaEnvioStub.values()).stream().filter(c -> c.value.equals(value)).findFirst().get();
    }
    
    public static ZonaEnvioStub fromStub(ZonaEnvioStub zona) {
        return ZonaEnvioStub.valueOf(zona.name());
    }
}
