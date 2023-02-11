package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class ConnectDB {
    private static String url = "jdbc:mysql://localhost/bibliodb";
    private static String user = "root";
    private static String password = "";
    private static Connection connect ;
      
      public static Connection getInstance(){
          if(connect == null){
              try {
                  connect = (Connection)DriverManager.getConnection(url,user,password);
              } catch (SQLException ex) {
                  Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
              }
      }
          return connect;
            
}
    
}



