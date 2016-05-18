package persistencia;

import excepciones.DAOException;
import persistencia_dto.ClienteDTO;

/**
 * Created by ignaciosantonjamolina on 13/5/16.
 */
public final class DAL {

    private IClienteDAO cliDAO;

    private static DAL INSTANCE = new DAL();

    private DAL() {
        try {
            this.cliDAO = new ClienteDAOImp();
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    public static DAL getDal() {
        return INSTANCE;
    }

    public boolean crearCliente(ClienteDTO clienteDTO){
        try{
            cliDAO.crearCliente(clienteDTO);
            return true;
        }catch(DAOException e){ return false;}
    }


}