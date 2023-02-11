package dao;

import java.sql.*;

public class TestConnection {

   
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
