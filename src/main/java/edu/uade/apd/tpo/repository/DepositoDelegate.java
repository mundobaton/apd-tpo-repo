package edu.uade.apd.tpo.repository;

import java.rmi.Naming;

public class DepositoDelegate {
    private static DepositoDelegate instance;

    private SistemaDepositoRepository sistemaDepositoRepository;

    public static DepositoDelegate getInstance() throws Exception {
        if (instance == null) {
            instance = new DepositoDelegate();
        }
        return instance;
    }

    private DepositoDelegate() throws Exception {
        sistemaDepositoRepository = (SistemaDepositoRepository) Naming.lookup("//127.0.0.1/deposito");
    }
}
