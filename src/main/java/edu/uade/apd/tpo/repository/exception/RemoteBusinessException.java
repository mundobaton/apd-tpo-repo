package edu.uade.apd.tpo.repository.exception;

import java.rmi.RemoteException;

public class RemoteBusinessException extends RemoteException {

    public RemoteBusinessException(String message) {
        super(message);
    }

}
