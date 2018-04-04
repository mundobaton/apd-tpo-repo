package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;
import edu.uade.apd.tpo.repository.stub.UsuarioStub;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class AdministracionDelegate {

    private SistemaAdministracionRepository sistemaAdministracionRepository;

    public AdministracionDelegate() throws Exception {
        sistemaAdministracionRepository = (SistemaAdministracionRepository) Naming.lookup("//127.0.0.1/administracion");
    }

    public UsuarioStub login(String email, String password) throws RemoteException {
        return sistemaAdministracionRepository.login(email, password);
    }

    public static void main(String[] args) {
        try {
            AdministracionDelegate delegate = new AdministracionDelegate();
            UsuarioStub stub = delegate.login("asd@email.com", "asd");
            System.out.println(stub.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
