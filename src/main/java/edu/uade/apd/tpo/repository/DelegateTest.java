package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;
import edu.uade.apd.tpo.repository.stub.CondIvaStub;
import edu.uade.apd.tpo.repository.stub.RolStub;
import edu.uade.apd.tpo.repository.stub.UsuarioStub;

import java.util.List;
import java.util.UUID;

public class DelegateTest {

    public void testCrearUsuario(AdministracionDelegate delegate) {
        String random = UUID.randomUUID().toString();
        delegate.crearUsuario(random + "@email.com", random, RolStub.ADMINISTRACION);
    }

    public void testListarUsuarios(AdministracionDelegate delegate) {
        List<UsuarioStub> usuarios = delegate.getUsuarios();
        usuarios.forEach(u -> {
            System.out.println(u.getEmail());
        });
    }

    public void testCrearCliente(AdministracionDelegate delegate) {
        String random = UUID.randomUUID().toString();
        delegate.crearCliente(random + "@email.com", random, "un nombre fake", 123123, "1234-5678", CondIvaStub.CONS_FINAL, "Fake St", 123, "1406", "cap-fed", "buenos aires", 0, 1500);
    }

    public void testListarClientes(AdministracionDelegate delegate) {
        List<ClienteStub> clientes = delegate.getClientes();
        clientes.forEach(u -> {
            System.out.println(u);
        });
    }

    public static void main(String[] args) {
        AdministracionDelegate delegate;
        try {
            delegate = new AdministracionDelegate();
            DelegateTest test = new DelegateTest();
            //test.testCrearUsuario(delegate);
            //test.testListarUsuarios(delegate);
            //test.testCrearCliente(delegate);
            test.testListarClientes(delegate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
