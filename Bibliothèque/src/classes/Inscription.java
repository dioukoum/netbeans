package classes;

import java.util.Date;

/**
 *
 * @author lenovo
 */
public class Inscription {

    private int numero;
    private String nom;
    private String prenom;
    private String sexe;
    private String datenaissance;
    private String adresse;
    private String telephone;
    private String profession;
    private String nationalite;
    private String ville;
    private String region;
    private String pays;
    private String dateinscription;

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getDateinscription() {
        return dateinscription;
    }

    public void setDateinscription(String dateinscription) {
        this.dateinscription = dateinscription;
    }

    public Inscription() {
    }

    public Inscription(int numlecteur, String nom, String prenom, String sexe, String datenaissance, String adresse, String telephone, String profession, String nationalite, String ville, String region, String pays, String dateinscription) {
        this.numero = numlecteur;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.datenaissance = datenaissance;
        this.adresse = adresse;
        this.telephone = telephone;
        this.profession = profession;
        this.nationalite = nationalite;
        this.ville = ville;
        this.region = region;
        this.pays = pays;
        this.dateinscription = dateinscription;
    }

    public Inscription(String nom, String prenom, String sexe, String datenaissance, String adresse, String telephone, String profession, String nationalite, String ville, String region, String pays, String dateinscription) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.datenaissance = datenaissance;
        this.adresse = adresse;
        this.telephone = telephone;
        this.profession = profession;
        this.nationalite = nationalite;
        this.ville = ville;
        this.region = region;
        this.pays = pays;
        this.dateinscription = dateinscription;
    }

}
