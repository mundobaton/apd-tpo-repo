package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;
import edu.uade.apd.tpo.repository.stub.CondIvaStub;
import edu.uade.apd.tpo.repository.stub.RolStub;
import edu.uade.apd.tpo.repository.stub.UsuarioStub;
import edu.uade.apd.tpo.repository.stub.ZonaStub;

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
//long cuil, String email, String password, String nombre, String telefono, String calle, long num, String cp, String loc, String prov, CondIvaStub condIva, ZonaStub zona, float saldo, float limiteCredito
    public void testCrearCliente(AdministracionDelegate delegate) {
        String random = UUID.randomUUID().toString();
        delegate.crearCliente(3L, random + "@email.com", "un nombre fake", random, "1234-5678", "Fake St", 123, "1406", "cap-fed", "buenos aires", CondIvaStub.CONS_FINAL, ZonaStub.CABA, 0, 1500);
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
            delegate = AdministracionDelegate.getInstance();
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
