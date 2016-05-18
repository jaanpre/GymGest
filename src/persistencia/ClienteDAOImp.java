package persistencia;

import excepciones.DAOException;
import persistencia_dto.ClienteDTO;

import java.sql.SQLException;

/**
 * Created by ignaciosantonjamolina on 13/5/16.
 */
public class ClienteDAOImp implements IClienteDAO{

    protected ConnectionManager connManager;

    public ClienteDAOImp() throws DAOException {
        super();

        try {
            connManager = new ConnectionManager("gimGest");
        }
        catch (ClassNotFoundException e) {
            throw new DAOException(e);
        }
    }
    
    public void crearCliente(ClienteDTO cliente) throws DAOException{
        try{
        	//

//            String ins = "INSERT INTO PUBLIC.CLIENTE VALUES ('"
//                    +cliente.getDni()+"','"+cliente.getNombre()+"','"+cliente.getDireccion()+"','"
//                    +cliente.getTelefono()+"',"+cliente.isMaterial()+","+5+")";
        	
        	//String ins = "INSERT INTO PUBLIC.CLIENTE VALUES ('2020', 'a las 18.15', 'GCIVL', '765', TRUE, 1);";
        	
        	//String ins = "INSERT INTO PUBLIC.CLIENTE VALUES('CACOTA     ','NACHO           ','GCIVIL              ','96362           ',TRUE,2)";
        	//String ins = "INSERT INTO PUBLIC.BRANCHOFFICE VALUES(5,'Archiduque Carlos, 3')";
        	//String ins = "INSERT INTO CLIENTE VALUES ('755', 'NACHO', 'GCIVL', '765', TRUE, 1);";
        	//String ins = "INSERT INTO CLIENTE (ID) VALUES ('755')";
        	
        	String ins = "INSERT INTO PALAPADEL (ID) VALUES (100)"; 
        	
            connManager.connect();
            connManager.updateDB(ins);
            connManager.close();

        }
        catch (SQLException e){ System.out.println("error"); throw new DAOException(e); }
    }
}
