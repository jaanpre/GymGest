package persistencia;

import excepciones.DAOException;

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
}