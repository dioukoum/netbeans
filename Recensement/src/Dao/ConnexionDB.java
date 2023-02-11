/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mijo
 */
public class ConnexionDB {
     private static String url= "jdbc:mysql://localhost/population";
    private static String user= "root";
    private static String password= "";
    private static Connection connect;
    
    public static Connection getInstance()
    {
        if(connect == null)
        {
            try {
                connect= (Connection)DriverManager.getConnection(url,user,password);
            } catch (SQLException ex) {
                Logger.getLogger(ConnexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connect;
    }
}
