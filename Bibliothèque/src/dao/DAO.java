
package dao;
import java.sql.*;
import java.util.List;
/**
 *
 * @author DELL
 */
public abstract class DAO<T> {
    public Connection connect= ConnectDB.getInstance();
    //AJOUT
    public abstract void ajouter(T obj);
    //MODIFICATION
    public abstract void modifier(T obj, int id);
    //SUPPRESSION
    public abstract void supprimer(int id);
    //LISTE
   public abstract List<T> liste();
}
