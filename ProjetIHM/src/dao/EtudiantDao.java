/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classe.Etudiant;
import java.util.List;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class EtudiantDao extends Dao<Etudiant>{

    @Override
    public Etudiant recherche(int id) {
        Etudiant et= new Etudiant();
        
        try {
            ResultSet result= this.connect.createStatement().executeQuery("SELECT * FROM etudiant WHERE ide="+id);
            if(result.next())
            {
                et.setIde(result.getInt("ide"));
                et.setNom(result.getString("nom"));
                et.setPrenom(result.getString("prenom"));
                et.setClasse(result.getString("classe"));
                et.setTelephone(result.getString("telephone"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return et;
        }

    @Override
    public void ajouter(Etudiant obj) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("INSERT INTO etudiant(nom,prenom,classe,telephone) VALUES(?,?,?,?)");
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3, obj.getClasse());
            pst.setString(4, obj.getTelephone());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    @Override
    public void modifier(Etudiant obj, int id) {
                try {
            PreparedStatement pst= this.connect.prepareStatement("UPDATE etudiant SET nom=?,prenom=?,classe=?,telephone=? WHERE ide="+id);
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3, obj.getClasse());
            pst.setString(4, obj.getTelephone());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

    @Override
    public void supprimer(int id) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("DELETE FROM etudiant  WHERE ide="+id);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Etudiant> liste() {
        Etudiant et= new Etudiant();
        List<Etudiant> le= new ArrayList<>();
        
        try {
            ResultSet result= this.connect.createStatement().executeQuery("SELECT * FROM etudiant");
            while(result.next())
            {
                et.setIde(result.getInt("ide"));
                et.setNom(result.getString("nom"));
                et.setPrenom(result.getString("prenom"));
                et.setClasse(result.getString("classe"));
                et.setTelephone(result.getString("telephone"));
                le.add(et);
                et=new Etudiant();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return le;    
    }
    
}
