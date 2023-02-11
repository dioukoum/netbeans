/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.sql.*;
import java.util.List;
/**
 *
 * @author mijo
 * @param <T>
 */
public abstract class dao <T> {
      public Connection connect= ConnexionDB.getInstance();
    //RECHERCHE
    public abstract T recherche(int id);
    //AJOUT
    public abstract void enregistrer(T obj);
    //MODIFICATION
    public abstract void modifier(T obj, int id);
    //SUPPRESSION
    public abstract void supprimer(int id);
    //LISTE
    public abstract List<T> liste();
}
