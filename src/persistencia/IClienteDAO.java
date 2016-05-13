package persistencia;

import excepciones.DAOException;
import persistencia_dto.clienteDTO;


/**
 * Created by ignaciosantonjamolina on 13/5/16.
 */
public interface IClienteDAO {

    public void crearCliente(clienteDTO cliente) throws DAOException;

}
