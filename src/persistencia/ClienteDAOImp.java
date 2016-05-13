package persistencia;

import excepciones.DAOException;
import persistencia_dto.clienteDTO;

import java.sql.SQLException;

/**
 * Created by ignaciosantonjamolina on 13/5/16.
 */
public class ClienteDAOImp implements IClienteDAO{

    protected ConnectionManager connManager;

    public ClienteDAOImp() throws DAOException {
        super();

        try {
            connManager= new ConnectionManager("??");
        }
        catch (ClassNotFoundException e) {
            throw new DAOException(e);
        }
    }
    public void crearCliente(clienteDTO cliente) throws DAOException{
        try{

            String ins = "";

            connManager.connect();
            connManager.updateDB(ins);
            connManager.close();

        }
        catch (SQLException e){ throw new DAOException(e); }
    }
}
