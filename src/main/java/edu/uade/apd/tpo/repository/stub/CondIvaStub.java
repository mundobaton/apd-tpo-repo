package edu.uade.apd.tpo.repository.stub;

import java.util.Arrays;

public enum CondIvaStub {

    RESP_INSCRIPTO("Responsable Inscripto"),
    EXENTO("Exento"),
    CONS_FINAL("Consumidor Final");

    private String value;

    CondIvaStub(String val) {
            this.value = val;
    }

    public static CondIvaStub getCondIvaFromValue(String value) {
        return Arrays.asList(CondIvaStub.values()).stream().filter(c -> c.value.equals(value)).findFirst().get();
    }
}
