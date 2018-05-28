package edu.uade.apd.tpo.repository;

import org.junit.Before;
import org.junit.Test;

import java.rmi.RemoteException;

public class DespachoDelegateTest {

    private DespachoDelegate delegate;

    @Before
    public void setup() throws Exception {
        delegate = DespachoDelegate.getInstance();
    }

    @Test
    public void alistarPedido() throws RemoteException {
        delegate.alistarPedido(123L);
    }

    @Test
    public void despacharPedido() throws RemoteException {
        delegate.despacharPedido(123L);
    }

}
