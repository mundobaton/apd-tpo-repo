package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class ClienteDelegate {

    private ClienteControllerRepository clienteControllerRepository;

    public ClienteDelegate() throws Exception {
        clienteControllerRepository = (ClienteControllerRepository) Naming.lookup("//127.0.0.1/cliente");
    }

    public ClienteStub login(Long cuil, String password) throws RemoteException {
        return clienteControllerRepository.login(cuil, password);
    }

    public void test(ClienteStub stub) throws RemoteException {
        clienteControllerRepository.test(stub);
    }

    public static void main(String[] args) {
        try {
            ClienteDelegate delegate = new ClienteDelegate();
            ClienteStub stub = delegate.login(123L, "asd");
            System.out.println(stub.getNombre());

            stub.setNombre("Otro nombre");
            delegate.test(stub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
