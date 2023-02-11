
package Dao;

import classe.Recensement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RecensementDao extends dao<Recensement>{

    @Override
    public Recensement recherche(int id) {
         Recensement rc= new Recensement();
        try {
            ResultSet result= this.connect.createStatement().executeQuery("SELECT * FROM population WHERE id="+id);
            if(result.next()){
                rc.setId(result.getInt("id"));
                rc.setNom(result.getString("nom"));
                rc.setPrenom(result.getString("prenom"));
                rc.setSexe(result.getString("sexe"));
                rc.setLieudenaissance(result.getString("lieu_naiss"));
                rc.setNomdupere(result.getString("nom_pere"));
                rc.setDatedenaissance(result.getString("date_naiss"));
                rc.setProfession(result.getString("profession"));
                rc.setRegion(result.getString("region"));
                rc.setDomicile(result.getString("domicile"));
                rc.setDateenregistrement(result.getString("date_enregistrement"));
                
            }
        } catch (SQLException ex1) {
            Logger.getLogger(RecensementDao.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return rc;
    }

    @Override
    public void enregistrer(Recensement obj) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("INSERT INTO population(nom,prenom,date_naiss,sexe,lieu_naiss,nom_pere,domicile,profession,region,date_enregistrement) VALUES(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3,  obj.getDatedenaissance());
            pst.setString(4, obj.getSexe());
            pst.setString(5, obj.getLieudenaissance());
            pst.setString(6, obj.getNomdupere());
            pst.setString(7, obj.getDomicile());
            pst.setString(8, obj.getProfession());
            pst.setString(9, obj.getRegion());
            pst.setString(10,  obj.getDateenregistrement());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RecensementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Recensement obj, int id) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("UPDATE population SET nom=?,prenom=?,date_naiss=?,sexe=?,lieu_naiss=?,nom_pere=?,domicile=?,profession=?,region=?,date_enregistrement=? WHERE id="+id);
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3,  obj.getDatedenaissance());
            pst.setString(4, obj.getSexe());
            pst.setString(5, obj.getLieudenaissance());
            pst.setString(6, obj.getNomdupere());
            pst.setString(7, obj.getDomicile());
            pst.setString(8, obj.getProfession());
            pst.setString(9, obj.getRegion());
            pst.setString(10,  obj.getDateenregistrement());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RecensementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("DELETE FROM population WHERE id="+id);
            
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RecensementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Recensement> liste() {
        Recensement rc= new Recensement();
        List<Recensement> le= new ArrayList<>();
        try {
            ResultSet result= this.connect.createStatement().executeQuery("SELECT * FROM population");
            while(result.next()){
                rc.setId(result.getInt("id"));
                rc.setNom(result.getString("nom"));
                rc.setPrenom(result.getString("prenom"));
                rc.setSexe(result.getString("sexe"));
                rc.setLieudenaissance(result.getString("lieu_naiss"));
                rc.setNomdupere(result.getString("nom_pere"));
                rc.setDatedenaissance(result.getString("date_naiss"));
                rc.setProfession(result.getString("profession"));
                rc.setRegion(result.getString("region"));
                rc.setDomicile(result.getString("domicile"));
                rc.setDateenregistrement(result.getString("date_enregistrement"));
                le.add(rc);
                rc= new Recensement();
            }
        } catch (SQLException ex1) {
            Logger.getLogger(RecensementDao.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return le;
    }
    
}
