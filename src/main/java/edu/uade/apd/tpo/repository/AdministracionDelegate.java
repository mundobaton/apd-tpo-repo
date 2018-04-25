package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;
import edu.uade.apd.tpo.repository.stub.DomicilioStub;
import edu.uade.apd.tpo.repository.stub.UsuarioStub;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public class AdministracionDelegate {

    private SistemaAdministracionRepository sistemaAdministracionRepository;

    public AdministracionDelegate() throws Exception {
        sistemaAdministracionRepository = (SistemaAdministracionRepository) Naming.lookup("//127.0.0.1/administracion");
    }

    public void crearUsuario(String email, String password) {
        try {
            sistemaAdministracionRepository.crearUsuario(email, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarUsuario(UsuarioStub usuarioStub) {
        try {
            sistemaAdministracionRepository.actualizarUsuario(usuarioStub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<UsuarioStub> getUsuarios() {
        List usuarios = null;
        try {
            usuarios = sistemaAdministracionRepository.getUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public List<ClienteStub> getClientes() {
        List clientes = null;
        try {
            clientes = sistemaAdministracionRepository.getClientes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public void crearCliente(String email, String password, String nombre, long cuil, String telefono) {
        try {
            sistemaAdministracionRepository.crearCliente(email, password, nombre, cuil, telefono);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
