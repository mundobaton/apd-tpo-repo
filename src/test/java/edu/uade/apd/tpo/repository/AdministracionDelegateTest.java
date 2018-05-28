package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.CondIvaStub;
import edu.uade.apd.tpo.repository.stub.RolStub;
import edu.uade.apd.tpo.repository.stub.ZonaStub;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.rmi.RemoteException;

public class AdministracionDelegateTest {

    private AdministracionDelegate delegate;

    @Before
    public void setup() throws Exception {
        delegate = AdministracionDelegate.getInstance();
    }

    @Test
    public void testCrearUsuario() throws RemoteException {
        delegate.crearUsuario("usuario@delegate.com", "un password seguro", RolStub.DEPOSITO);
    }

    @Test
    public void testCrearCliente() throws RemoteException {
        delegate.crearCliente(3123123132L, "agustin@delegate.com", "123", "Baton", "4123-4567", "una calle", 1234L, "1406", "Capital", "Bsas", CondIvaStub.CONS_FINAL, ZonaStub.CABA, 1000, 500);
    }

    @Test
    public void testCrearPedido() throws RemoteException {
        delegate.crearPedido(3123123132L, "una calle", 123L, "1406", "Capital", "Buenos Aires", ZonaStub.CABA);
    }

}
