
package dao ;

import classes.Inscription;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class InscriptionDao extends DAO<Inscription> {

    
    public Inscription recherche(int id) {
        Inscription ins = new Inscription();

        try {
            ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM inscription WHERE id=" + id);
            if (result.next()) {
                ins.setNumero(result.getInt("id"));
                ins.setNom(result.getString("nom"));
                ins.setPrenom(result.getString("prenom"));
                ins.setSexe(result.getString("sexe"));
                ins.setDatenaissance(result.getString("date_de_naissance"));
                ins.setAdresse(result.getString("adresse"));
                ins.setTelephone(result.getString("telephone"));
                ins.setProfession(result.getString("profession"));
                ins.setNationalite(result.getString("nationalite"));
                ins.setVille(result.getString("ville"));
                ins.setRegion(result.getString("region"));
                ins.setPays(result.getString("pays_de_residence"));
                ins.setDateinscription(result.getString("Date_inscription"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(InscriptionDao.class.getName()).log(Level.SEVERE, "Lecteur trouver avec succes", ex);
        }
        return ins;
    }

    @Override
    public void ajouter(Inscription obj) {

        try {
            PreparedStatement pst = this.connect.prepareStatement("INSERT INTO inscription(id,nom,prenom,sexe,date_de_naissance,adresse,telephone,profession,nationalite,ville,region,pays_de_residence,date_inscription) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, obj.getNumero());
            pst.setString(2, obj.getNom());
            pst.setString(3, obj.getPrenom());
            pst.setString(4, obj.getSexe());
            pst.setString(5, obj.getDatenaissance());
            pst.setString(6, obj.getAdresse());
            pst.setString(7, obj.getTelephone());
            pst.setString(8, obj.getProfession());
            pst.setString(9, obj.getNationalite());
            pst.setString(10, obj.getVille());
            pst.setString(11, obj.getRegion());
            pst.setString(12, obj.getPays());
            pst.setString(13, obj.getDateinscription());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(InscriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Inscription obj, int numlecteur) {

        try {
            PreparedStatement pst = this.connect.prepareStatement("UPDATE inscription SET nom=?,prenom=?,"
                    + "sexe=?,date_de_naissance=?"
            + ",adresse=?,telephone=?,profession=?,nationalite=?,"
            + "ville=?,region=?,pays_de_residence=?,date_inscription=?  WHERE id=" + numlecteur);
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3, obj.getSexe());
            pst.setString(4, obj.getDatenaissance());
            pst.setString(5, obj.getAdresse());
            pst.setString(6, obj.getTelephone());
            pst.setString(7, obj.getProfession());
            pst.setString(8, obj.getNationalite());
            pst.setString(9, obj.getVille());
            pst.setString(10, obj.getRegion());
            pst.setString(11, obj.getPays());
            pst.setString(12, obj.getDateinscription());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(InscriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int numlecteur) {
        try {
            PreparedStatement pst = this.connect.prepareStatement("DELETE FROM inscription WHERE id=" + numlecteur);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(InscriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Inscription> liste() {
        Inscription ins = new Inscription();
        List<Inscription> le = new ArrayList<>();

        try {
            ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM inscription");
            while (result.next()) {
                ins.setNumero(result.getInt("id"));
                ins.setNom(result.getString("nom"));
                ins.setPrenom(result.getString("prenom"));
                ins.setSexe(result.getString("sexe"));
                ins.setDatenaissance(result.getString("date_de_naissance"));
                ins.setAdresse(result.getString("adresse"));
                ins.setTelephone(result.getString("telephone"));
                ins.setProfession(result.getString("profession"));
                ins.setNationalite(result.getString("nationalite"));
                ins.setVille(result.getString("ville"));
                ins.setRegion(result.getString("region"));
                ins.setPays(result.getString("pays_de_residence"));
                ins.setDateinscription(result.getString("date_inscription"));
                le.add(ins);
                ins = new Inscription();

            }

        } catch (SQLException ex) {
            Logger.getLogger(InscriptionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return le;
    }

}
