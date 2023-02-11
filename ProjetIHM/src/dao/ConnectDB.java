/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class ConnectDB 
{
    
    private static String url= "jdbc:mysql://localhost/gl3db";
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
                Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connect;
    }
}
