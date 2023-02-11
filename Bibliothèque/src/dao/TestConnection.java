/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;

/**
 *
 * @author Awa
 */
public class TestConnection {
 



/**
 *
 * @author lenovo
     * @param args
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = ConnectDB.getInstance();
        if(con != null){
            System.out.println("Connection etablie");
        }else{
            System.out.println("Connection non etablie");
        }
    }
    
}

    

