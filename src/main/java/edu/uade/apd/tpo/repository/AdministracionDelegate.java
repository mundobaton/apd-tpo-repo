package edu.uade.apd.tpo.repository;

import edu.uade.apd.tpo.repository.stub.ClienteStub;
import edu.uade.apd.tpo.repository.stub.CondIvaStub;
import edu.uade.apd.tpo.repository.stub.PedidoStub;
import edu.uade.apd.tpo.repository.stub.RolStub;
import edu.uade.apd.tpo.repository.stub.UsuarioStub;
import edu.uade.apd.tpo.repository.stub.ZonaStub;

import java.rmi.Naming;
import java.util.List;

public class AdministracionDelegate {
	
	private static AdministracionDelegate instance;

    private SistemaAdministracionRepository sistemaAdministracionRepository;
    
	public static AdministracionDelegate getInstance() throws Exception {
		if (instance == null) {
			instance = new AdministracionDelegate();
		}
		return instance;
	}

    private AdministracionDelegate() throws Exception {
        sistemaAdministracionRepository = (SistemaAdministracionRepository) Naming.lookup("//127.0.0.1/administracion");
    }

    public void crearUsuario(String email, String password, RolStub rol) {
        try {
            sistemaAdministracionRepository.crearUsuario(email, password, rol);
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

    public void crearCliente(long cuil, String email, String password, String nombre, String telefono, String calle, long num, String cp, String loc, String prov, CondIvaStub condIva, ZonaStub zona, float saldo, float limiteCredito) {
        try {
            sistemaAdministracionRepository.crearCliente(cuil, email, password, nombre, telefono, calle, num, cp, loc, prov, condIva, zona, saldo, limiteCredito);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public List<PedidoStub> getPedidosPendientes() {
		   List pedidosPendientes = null;
	        try {
	        	pedidosPendientes = sistemaAdministracionRepository.getPedidosPendientes();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return pedidosPendientes;
		
	}
}
