package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author DELL
 */
public class ConnectDB 
{
    
    private final static String URL= "jdbc:mysql://localhost/mairiedb";
    private final static String USER= "root";
    private final static String PASSWORD= "";
    private static Connection connect;
    
    public static Connection getInstance()
    {
        if(connect == null)
        {
            try {
                connect= (Connection)DriverManager.getConnection(URL,USER,PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connect;
    }
}
