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
    //SUPPRIMER
    public abstract void supprimer(int id);
    //LISTE
    public abstract List<T> liste();
}
