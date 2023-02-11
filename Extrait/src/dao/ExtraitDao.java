package dao;

import classe.Extrait;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExtraitDao extends Dao<Extrait>{

    @Override
    public Extrait recherche(int id) {
        Extrait ex= new Extrait();
        try {
            ResultSet result= this.connect.createStatement().executeQuery("SELECT * FROM extrait WHERE id="+id);
            if(result.next()){
                ex.setId(result.getInt("id"));
                ex.setNom(result.getString("nom"));
                ex.setPrenom(result.getString("prenom"));
                ex.setSexe(result.getString("sexe"));
                ex.setLieu(result.getString("lieu"));
                ex.setNompere(result.getString("nompere"));
                ex.setPrenompere(result.getString("prenompere"));
                ex.setDomicilepere(result.getString("domicilepere"));
                ex.setProfessionpere(result.getString("professionpere"));
                ex.setNommere(result.getString("nommere"));
                ex.setPrenommere(result.getString("prenommere"));
                ex.setDomicilemere(result.getString("domicilemere"));
                ex.setProfessionmere(result.getString("professionmere"));
                ex.setDatenaiss(result.getString("datenaiss"));
                ex.setDatedelivrance(result.getString("detedelivrance"));
            }
        } catch (SQLException ex1) {
            Logger.getLogger(ExtraitDao.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return ex;
    }

    @Override
    public void ajouter(Extrait obj) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("INSERT INTO extrait(nom,prenom,datenaiss,sexe,lieu,nompere,prenompere,domicilepere,professionpere,nommere,prenommere,domicilemere,professionmere,detedelivrance) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3,  obj.getDatenaiss());
            pst.setString(4, obj.getSexe());
            pst.setString(5, obj.getLieu());
            pst.setString(6, obj.getNompere());
            pst.setString(7, obj.getPrenompere());
            pst.setString(8, obj.getDomicilepere());
            pst.setString(9, obj.getProfessionpere());
            pst.setString(10, obj.getNommere());
            pst.setString(11, obj.getPrenommere());
            pst.setString(12, obj.getDomicilemere());
            pst.setString(13, obj.getProfessionmere());
            pst.setString(14,  obj.getDatedelivrance());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExtraitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifier(Extrait obj, int id) {
        try {
            PreparedStatement pst= this.connect.prepareStatement("UPDATE extrait SET nom=?,prenom=?,datenaiss=?,sexe=?,lieu=?,nompere=?,prenompere=?,domicilepere=?,professionpere=?,nommere=?,prenommere=?,domicilemere=?,professionmere=?,detedelivrance=? WHERE id="+id);
            pst.setString(1, obj.getNom());
            pst.setString(2, obj.getPrenom());
            pst.setString(3,  obj.getDatenaiss());
            pst.setString(4, obj.getSexe());
            pst.setString(5, obj.getLieu());
            pst.setString(6, obj.getNompere());
            pst.setString(7, obj.getPrenompere());
            pst.setString(8, obj.getDomicilepere());
            pst.setString(9, obj.getProfessionpere());
            pst.setString(10, obj.getNommere());
            pst.setString(11, obj.getPrenommere());
            pst.setString(12, obj.getDomicilemere());
            pst.setString(13, obj.getProfessionmere());
            pst.setString(14,  obj.getDatedelivrance());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ExtraitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void supprimer(int id) {
         try {
            PreparedStatement pst= this.connect.prepareStatement("DELETE FROM extrait WHERE id="+id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ExtraitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Extrait> liste() {
        Extrait ex= new Extrait();
        List<Extrait> le= new ArrayList<>();
        try {
            ResultSet result= this.connect.createStatement().executeQuery("SELECT * FROM extrait");
            while(result.next()){
                ex.setId(result.getInt("id"));
                ex.setNom(result.getString("nom"));
                ex.setPrenom(result.getString("prenom"));
                ex.setSexe(result.getString("sexe"));
                ex.setLieu(result.getString("lieu"));
                ex.setNompere(result.getString("nompere"));
                ex.setPrenompere(result.getString("prenompere"));
                ex.setDomicilepere(result.getString("domicilepere"));
                ex.setProfessionpere(result.getString("professionpere"));
                ex.setNommere(result.getString("nommere"));
                ex.setPrenommere(result.getString("prenommere"));
                ex.setDomicilemere(result.getString("domicilemere"));
                ex.setProfessionmere(result.getString("professionmere"));
                ex.setDatenaiss(result.getString("datenaiss"));
                ex.setDatedelivrance(result.getString("detedelivrance"));
                le.add(ex);
                ex= new Extrait();
            }
        } catch (SQLException ex1) {
            Logger.getLogger(ExtraitDao.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return le;
    }
}
