package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.model.Cliente;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class ClienteDelegate {

    private ClienteControllerRepository clienteControllerRepository;

    public ClienteDelegate() throws Exception {
        clienteControllerRepository = (ClienteControllerRepository) Naming.lookup("//127.0.0.1/cliente");
    }

    public Cliente login(Long cuil, String password) throws RemoteException {
        return clienteControllerRepository.login(cuil, password);
    }

    public static void main(String[] args) {
        try {
            ClienteDelegate delegate = new ClienteDelegate();
            Cliente cliente = delegate.login(123L, "asd");
            System.out.println(cliente.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
