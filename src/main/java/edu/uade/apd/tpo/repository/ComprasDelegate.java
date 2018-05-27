package edu.uade.apd.tpo.repository;

import java.rmi.Naming;

public class ComprasDelegate {

    private static ComprasDelegate instance;

    private SistemaComprasRepository sistemaComprasRepository;

    public static ComprasDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new ComprasDelegate();
        }
        return instance;
    }

    private ComprasDelegate() throws Exception {
        sistemaComprasRepository = (SistemaComprasRepository) Naming.lookup("//127.0.0.1/compras");
    }
}
