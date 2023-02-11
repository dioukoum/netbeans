/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import classe.recensement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mijo
 */
    public class recensementDao extends dao<recensement>{

    public recensement recherche(int id) {
        recensement re= new recensement();
        
        try {
            ResultSet result= this.connect.createStatement().executeQuery("SELECT * FROM recensement WHERE ide="+id);
            if(result.next())
            {
                re.setId(result.getInt("id"));
                re.setPrenom(result.getString("prenom"));
                re.setNom(result.getString("nom"));
                re.setDatedenaissance(result.getString("datedenaissance"));
                re.setLieudenaissance(result.getString("lieudenaissance"));
                re.setRegion(result.getString("region"));
                re.setSexe(result.getString("sexe"));
                re.setDomicile(result.getString("domicile"));
                re.setProfession(result.getString("profession"));
                re.setNomdupere(result.getString("nomdupere"));
                re.setDateenregistrement(result.getString("dateenregistrement"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(recensementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return re;
        }

    public void ajouter(recensement obj) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("INSERT INTO etudiant(nom,prenom,classe,telephone) VALUES(?,?,?,?)");
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3, obj.getDatedenaissance());
            pst.setString(4, obj.getLieudenaissance());
             pst.setString(3, obj.getRegion());
            pst.setString(4, obj.getSexe());
             pst.setString(3, obj.getDomicile());
            pst.setString(4, obj.getProfession());
             pst.setString(3, obj.getNomdupere());
            pst.setString(4, obj.getDateenregistrement());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(recensementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    public void modifier(recensement obj, int id) {
                try {
            PreparedStatement pst= this.connect.prepareStatement("UPDATE recensement SET nom=?,prenom=?,classe=?,telephone=? WHERE ide="+id);
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3, obj.getDatedenaissance());
            pst.setString(4, obj.getLieudenaissance());
             pst.setString(3, obj.getRegion());
            pst.setString(4, obj.getSexe());
             pst.setString(3, obj.getProfession());
            pst.setString(4, obj.getNomdupere());
             pst.setString(3, obj.getDateenregistrement());
            
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(recensementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

    public void supprimer(int id) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("DELETE FROM recensement  WHERE ide="+id);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(recensementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<recensement> liste() {
        recensement re= new recensement();
        List<recensement> le= new ArrayList<>();
        
        try {
            ResultSet result= this.connect.createStatement().executeQuery("SELECT * FROM recensement");
            while(result.next())
            {
                re.setId(result.getInt("ide"));
                re.setNom(result.getString("nom"));
                re.setPrenom(result.getString("prenom"));
                re.setDatedenaissance(result.getString("Datedenaissance"));
                re.setLieudenaissance(result.getString("Lieudenaissance"));
                re.setRegion(result.getString("Region"));
                re.setSexe(result.getString("Sexe"));
                re.setProfession(result.getString("Profession"));
                re.setNomdupere(result.getString("Nomdupere"));
                le.add(re);
                re=new recensement();
            }
        } catch (SQLException ex) {
            Logger.getLogger(recensementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return le;    
    }

   
    
}


