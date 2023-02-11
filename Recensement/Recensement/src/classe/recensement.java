/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author mijo
 */
public class recensement {
private int id;
private String prenom;
private String nom;
private String datedenaissance;
private String lieudenaissance;
private String region;
private String sexe;
private String domicile;
private String profession;
private String nomdupere;
private String dateenregistrement;

    public recensement(int id, String prenom, String nom, String datedenaissance, String lieudenaissance, String region, String sexe, String domicile, String profession, String nomdupere, String dateenregistrement) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.datedenaissance = datedenaissance;
        this.lieudenaissance = lieudenaissance;
        this.region = region;
        this.sexe = sexe;
        this.domicile = domicile;
        this.profession = profession;
        this.nomdupere = nomdupere;
        this.dateenregistrement = dateenregistrement;
    }

    public recensement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getDatedenaissance() {
        return datedenaissance;
    }

    public String getLieudenaissance() {
        return lieudenaissance;
    }

    public String getRegion() {
        return region;
    }

    public String getSexe() {
        return sexe;
    }

    public String getDomicile() {
        return domicile;
    }

    public String getProfession() {
        return profession;
    }

    public String getNomdupere() {
        return nomdupere;
    }

    public String getDateenregistrement() {
        return dateenregistrement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDatedenaissance(String datedenaissance) {
        this.datedenaissance = datedenaissance;
    }

    public void setLieudenaissance(String lieudenaissance) {
        this.lieudenaissance = lieudenaissance;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setNomdupere(String nomdupere) {
        this.nomdupere = nomdupere;
    }

    public void setDateenregistrement(String dateenregistrement) {
        this.dateenregistrement = dateenregistrement;
    }
                                
        
   
  
    
}
