package edu.uade.apd.tpo.repository.stub;

import java.util.Arrays;

public enum RolStub {

    TODOS("Todos"),
    ADMIN("Administración"),
    DEPOSITO("Deposito"),
    DESPACHO("Despacho"),
    FACT("Facturación"),
    COMPRAS("Compras"),
    CLIENTE("Cliente");
	
	
    private String value;

    RolStub(String val) {
            this.value = val;
    }

    public static RolStub getRolFromValue(String value) {
        return Arrays.asList(RolStub.values()).stream().filter(c -> c.value.equals(value)).findFirst().get();
    }
}
