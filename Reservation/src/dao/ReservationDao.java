package dao;

import classes.Reservation;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReservationDao extends Dao<Reservation>{

    @Override
    public Reservation recherche(int id) {
        Reservation re= new Reservation();
        try {
            ResultSet result= this.connect.createStatement().executeQuery("SELECT * FROM reservation WHERE id="+id);
            if(result.next()){
                re.setId(result.getInt("id"));
                re.setNom(result.getString("nom"));
                re.setPrenom(result.getString("prenom"));
                re.setSexe(result.getString("sexe"));
                re.setAdresse(result.getString("adresse"));
                re.setTelephone(result.getString("telephone"));
                re.setCompagnie(result.getString("compagnie"));
                re.setDate_depart(result.getString("date_depart"));
                re.setHeure_depart(result.getString("heure_depart"));
                re.setSource(result.getString("source"));
                re.setDestination(result.getString("destination"));
                re.setMontant(result.getFloat("montant"));
                re.setDate_reservation(result.getString("date_reservation")); 
            }
        } catch (SQLException ex1) {
            Logger.getLogger(ReservationDao.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return re;
    }

    @Override
    public void ajouter(Reservation obj) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("INSERT INTO reservation(nom,prenom,sexe,adresse,telephone,compagnie,date_depart,heure_depart,source,destination,montant,date_reservation) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3, obj.getSexe());
            pst.setString(4, obj.getAdresse());
            pst.setString(5, obj.getTelephone());
            pst.setString(6, obj.getCompagnie());
            pst.setString(7, obj.getDate_depart());
            pst.setString(8, obj.getHeure_depart());
            pst.setString(9, obj.getSource());
            pst.setString(10, obj.getDestination());
            pst.setFloat(11, obj.getMontant());
            pst.setString(12, obj.getDate_reservation());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Reservation obj, int id) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("UPDATE reservation SET nom=?,prenom=?,sexe=?,adresse=?,telephone=?,compagnie=?,date_depart=?,heure_depart=?,source=?,destination=?,montant=?,date_reservation=? WHERE id="+id);
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3, obj.getSexe());
            pst.setString(4, obj.getAdresse());
            pst.setString(5, obj.getTelephone());
            pst.setString(6, obj.getCompagnie());
            pst.setString(7, obj.getDate_depart());
            pst.setString(8, obj.getHeure_depart());
            pst.setString(9, obj.getSource());
            pst.setString(10, obj.getDestination());
            pst.setFloat(11, obj.getMontant());
            pst.setString(12, obj.getDate_reservation());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
         try {
            PreparedStatement pst= this.connect.prepareStatement("DELETE FROM reservation WHERE id="+id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Reservation> liste() {
        Reservation re= new Reservation();
        List<Reservation> le= new ArrayList<>();
        try {
            ResultSet result= this.connect.createStatement().executeQuery("SELECT * FROM reservation");
            while(result.next()){
                re.setId(result.getInt("id"));
                re.setNom(result.getString("nom"));
                re.setPrenom(result.getString("prenom"));
                re.setSexe(result.getString("sexe"));
                re.setAdresse(result.getString("adresse"));
                re.setTelephone(result.getString("telephone"));
                re.setCompagnie(result.getString("compagnie"));
                re.setDate_depart(result.getString("date_depart"));
                re.setHeure_depart(result.getString("heure_depart"));
                re.setSource(result.getString("source"));
                re.setDestination(result.getString("destination"));
                re.setMontant(result.getFloat("montant"));
                re.setDate_reservation(result.getString("date_reservation")); 
                le.add(re);
                re = new Reservation();
            }
            
        } catch (SQLException ex1) {
            Logger.getLogger(ReservationDao.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return le;
    }
}
