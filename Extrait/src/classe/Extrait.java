package classe;

import java.util.Date;

/**
 * @author Dioukou
 */
public class Extrait {
    private int id;
    private String nom,
            prenom,sexe,lieu,
            nompere,prenompere,
            domicilepere,professionpere,
            nommere,prenommere,domicilemere,
            professionmere;
    
    private String datenaiss,datedelivrance;

    public Extrait() {
    }

    public Extrait(int id, String nom, String prenom, String sexe,String lieu, String nompere, String prenompere, String domicilepere, String professionpere, String nommere, String prenommere, String domicilemere, String professionmere, String datenaiss, String datedelivrance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.lieu = lieu;
        this.nompere = nompere;
        this.prenompere = prenompere;
        this.domicilepere = domicilepere;
        this.professionpere = professionpere;
        this.nommere = nommere;
        this.prenommere = prenommere;
        this.domicilemere = domicilemere;
        this.professionmere = professionmere;
        this.datenaiss = datenaiss;
        this.datedelivrance = datedelivrance;
    }

    public Extrait(String nom, String prenom, String sexe,String lieu, String nompere, String prenompere, String domicilepere, String professionpere, String nommere, String prenommere, String domicilemere, String professionmere, String datenaiss, String datedelivrance) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.lieu = lieu;
        this.nompere = nompere;
        this.prenompere = prenompere;
        this.domicilepere = domicilepere;
        this.professionpere = professionpere;
        this.nommere = nommere;
        this.prenommere = prenommere;
        this.domicilemere = domicilemere;
        this.professionmere = professionmere;
        this.datenaiss = datenaiss;
        this.datedelivrance = datedelivrance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getNompere() {
        return nompere;
    }

    public void setNompere(String nompere) {
        this.nompere = nompere;
    }

    public String getPrenompere() {
        return prenompere;
    }

    public void setPrenompere(String prenompere) {
        this.prenompere = prenompere;
    }

    public String getDomicilepere() {
        return domicilepere;
    }

    public void setDomicilepere(String domicilepere) {
        this.domicilepere = domicilepere;
    }

    public String getProfessionpere() {
        return professionpere;
    }

    public void setProfessionpere(String professionpere) {
        this.professionpere = professionpere;
    }

    public String getNommere() {
        return nommere;
    }

    public void setNommere(String nommere) {
        this.nommere = nommere;
    }

    public String getPrenommere() {
        return prenommere;
    }

    public void setPrenommere(String prenommere) {
        this.prenommere = prenommere;
    }

    public String getDomicilemere() {
        return domicilemere;
    }

    public void setDomicilemere(String domicilemere) {
        this.domicilemere = domicilemere;
    }

    public String getProfessionmere() {
        return professionmere;
    }

    public void setProfessionmere(String professionmere) {
        this.professionmere = professionmere;
    }

    public String getDatenaiss() {
        return datenaiss;
    }

    public void setDatenaiss(String datenaiss) {
        this.datenaiss = datenaiss;
    }

    public String getDatedelivrance() {
        return datedelivrance;
    }

    public void setDatedelivrance(String datedelivrance) {
        this.datedelivrance = datedelivrance;
    }
    
    
}
