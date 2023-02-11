/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author DELL
 */
public class Etudiant {
    private int ide;
    private String nom;
    private String prenom;
    private String classe;
    private String telephone;

    public Etudiant() {
    }

    public Etudiant(int ide, String nom, String prenom, String classe, String telephone) {
        this.ide = ide;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.telephone = telephone;
    }

    public Etudiant(String nom, String prenom, String classe, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.telephone = telephone;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
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

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    
}
