/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import java.util.List;
/**
 *
 * @author DELL
 */
public abstract class Dao<T> {
    public Connection connect= ConnectDB.getInstance();
    //RECHERCHE
    public abstract T recherche(int id);
    //AJOUT
    public abstract void ajouter(T obj);
    //MODIFICATION
    public abstract void modifier(T obj, int id);
    //SUPPRESSION
    public abstract void supprimer(int id);
    //LISTE
    public abstract List<T> liste();
}
