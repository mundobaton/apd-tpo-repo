package edu.uade.apd.tpo.repository;

import java.rmi.Naming;

public class FacturacionDelegate {
    private static FacturacionDelegate instance;

    private SistemaFacturacionRepository sistemaFacturacionRepository;

    public static FacturacionDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new FacturacionDelegate();
        }
        return instance;
    }

    private FacturacionDelegate() throws Exception {
        sistemaFacturacionRepository = (SistemaFacturacionRepository) Naming.lookup("//127.0.0.1/facturacion");
    }
}
