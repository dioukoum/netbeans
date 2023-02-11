/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.sql.*;
/**
 *
 * @author mijo
 */
public class TestConnexion {
      public static void main(String[] args) {
        // TODO code application logic here
        Connection con= ConnexionDB.getInstance();
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
