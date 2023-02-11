/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class TestConnexion {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con= ConnectDB.getInstance();
        if(con != null)
        {
            System.out.println("Connexion etablie");
        }
        else
        {
            System.out.println("Echec de connexion");
        }
    }
    
}
