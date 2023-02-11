/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author DELL
 */
public class Student {
    private int ide;
    private String nom,prenom,classe,telephone;
    
    public Student(){
        
    }

    public Student(int ide, String nom, String prenom, String classe, String telephone) {
        this.ide = ide;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.telephone = telephone;
    }
    
    public Student(String nom, String prenom, String classe,String telephone){
        this.nom= nom;
        this.prenom= prenom;
        this.classe= classe;
        this.telephone= telephone;
    }
    
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom= nom;
    }
    public String getPrrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom= prenom;
    }
    public String getClasse(){
        return this.classe;
    }
    public void setClasse(String classe){
        this.classe= classe;
    }
    public String getTelephone(){
        return this.telephone;
    }
    public void setTelephone(String telephone){
        this.telephone= telephone;
    }
}
