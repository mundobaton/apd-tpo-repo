package edu.uade.apd.tpo.repository;

import org.junit.Before;
import org.junit.Test;

import java.rmi.RemoteException;

public class ComprasDelegateTest {

    private ComprasDelegate delegate;

    @Before
    public void setup() throws Exception {
        delegate = ComprasDelegate.getInstance();
    }

    @Test
    public void generarOrdenCompra() throws RemoteException {
        delegate.generarOrdenCompra(123L, 321L);
    }

    @Test
    //Este metodo solo hay que llamarlo luego de reaizar el ingreso de una compra en deposito
    public void aceptarOrdenCompra() throws RemoteException {
        delegate.aceptarOrdenCompra(27L);
    }
}
