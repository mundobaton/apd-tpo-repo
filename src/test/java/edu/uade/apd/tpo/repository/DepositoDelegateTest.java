package edu.uade.apd.tpo.repository;

import org.junit.Before;
import org.junit.Test;

import java.rmi.RemoteException;

public class DepositoDelegateTest {

    DepositoDelegate delegate;

    @Before
    public void setup() throws Exception {
        delegate = DepositoDelegate.getInstance();
    }

    @Test
    public void testCompletarPedido() throws RemoteException {
        delegate.completarPedido(123L);
    }

}
