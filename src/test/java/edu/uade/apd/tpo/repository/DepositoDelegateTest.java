package edu.uade.apd.tpo.repository;

import org.junit.Before;
import org.junit.Test;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class DepositoDelegateTest {

    DepositoDelegate delegate;

    @Before
    public void setup() throws Exception {
        delegate = DepositoDelegate.getInstance();
    }

    @Test
    public void completarPedido() throws RemoteException {
        delegate.completarPedido(123L);
    }

    @Test
    public void testAceptarOrdenCompra() throws RemoteException {
        delegate.aceptarOrdenCompra(1L);
    }
}
