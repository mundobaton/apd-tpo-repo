package edu.uade.apd.tpo.repository.delegate;

import edu.uade.apd.tpo.repository.SistemaAdministracionRepository;
import edu.uade.apd.tpo.repository.dto.ClienteDTO;
import edu.uade.apd.tpo.repository.dto.PedidoDTO;
import edu.uade.apd.tpo.repository.dto.RolDTO;
import edu.uade.apd.tpo.repository.dto.UsuarioDTO;
import edu.uade.apd.tpo.repository.exception.RemoteBusinessException;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

public class AdministracionDelegate {

	public static AdministracionDelegate instance;
	private SistemaAdministracionRepository sistemaAdministracionRepository;

	private AdministracionDelegate() throws Exception {
		sistemaAdministracionRepository = (SistemaAdministracionRepository) Naming.lookup("//127.0.0.1/administracion");
	}

	public static AdministracionDelegate getInstance() throws Exception {
		if (instance == null) {
			instance = new AdministracionDelegate();
		}
		return instance;
	}

	public void crearCliente(String email, String nombre, Long cuit, String password, String calle, int numero,
			String localidad, String provincia, String codPostal, float saldo, float credito)
			throws RemoteBusinessException {
		try {
			sistemaAdministracionRepository.crearCliente(email, nombre, cuit, password, calle, numero, localidad,
					provincia, codPostal, saldo, credito);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}

	}

	public void crearUsuario(String legajo, String password, RolDTO rol) throws RemoteBusinessException {
		try {
			sistemaAdministracionRepository.crearUsuario(legajo, password, rol);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}

	}

	public ClienteDTO loginCliente(String email, String password) throws RemoteBusinessException {
		try {
			return sistemaAdministracionRepository.loginCliente(email, password);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}
	}

	public UsuarioDTO loginUsuario(String legajo, String password) throws RemoteBusinessException {
		try {
			return sistemaAdministracionRepository.loginUsuario(legajo, password);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}
	}

	public ClienteDTO findClienteById(Long clienteId) throws RemoteBusinessException {
		try {
			return sistemaAdministracionRepository.findClienteById(clienteId);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}
	}

	public Long crearPedido(Long clienteId, String calle, int numero, String localidad, String provincia,
			String codPostal) throws RemoteBusinessException {
		try {
			return sistemaAdministracionRepository.crearPedido(clienteId, calle, numero, localidad, provincia,
					codPostal);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}
	}

	public void agregarItemPedido(Long pedidoId, Long articuloId, int cantidad) throws RemoteBusinessException {
		try {
			sistemaAdministracionRepository.agregarItemPedido(pedidoId, articuloId, cantidad);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}
	}

	public void finalizarCargaItems(Long pedidoId) throws RemoteBusinessException {
		try {
			sistemaAdministracionRepository.finalizarCargaItems(pedidoId);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}
	}

	public void aprobarPedido(Long pedidoId, String mensaje) throws RemoteBusinessException {
		try {
			sistemaAdministracionRepository.aprobarPedido(pedidoId, mensaje);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}
	}

	public void aprobarPedido(Long pedidoId) throws RemoteBusinessException {
		try {
			sistemaAdministracionRepository.aprobarPedido(pedidoId);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}
	}

	public void rechazarPedido(Long pedidoId, String mensaje) throws RemoteBusinessException {
		try {
			sistemaAdministracionRepository.rechazarPedido(pedidoId, mensaje);
		} catch (RemoteException re) {
			throw new RemoteBusinessException(re.detail.getMessage());
		}
	}

	public PedidoDTO findPedidoById(Long pedidoId) throws RemoteBusinessException{
	   try {
		   return sistemaAdministracionRepository.findPedidoById(pedidoId);
	   }catch (RemoteException re){
			throw new RemoteBusinessException(re.detail.getMessage());
	   }
	}
	
	public List<PedidoDTO> obtenerPedidosPendientes() throws RemoteBusinessException{
		try {
			return sistemaAdministracionRepository.obtenerPedidosPendientes();
	    }catch (RemoteException re){
			throw new RemoteBusinessException(re.detail.getMessage());
	    }
	}

	public List<ClienteDTO> getClientes() throws RemoteBusinessException{
		   try {
			   return sistemaAdministracionRepository.getClientes();
		   }catch (RemoteException re){
				throw new RemoteBusinessException(re.getMessage());
		   }
	   }

}
