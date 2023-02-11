
package classes;

public class Reservation {
    private int id;
    private String nom,prenom,sexe,adresse,telephone,compagnie,date_depart,heure_depart,source,destination;
    private float montant;
    private String date_reservation;

    public Reservation() {
    }

    public Reservation(int id, String nom, String prenom,String sexe,String adresse, String telephone, String compagnie, String date_depart,String heure_depart ,String source, String destination, float montant, String date_reservation) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.adresse = adresse;
        this.telephone = telephone;
        this.compagnie = compagnie;
        this.date_depart = date_depart;
        this.heure_depart = heure_depart;
        this.source = source;
        this.destination = destination;
        this.montant = montant;
        this.date_reservation = date_reservation;
    }

    public Reservation(String nom, String prenom,String sexe, String adresse, String telephone, String compagnie, String date_depart,String heure_depart, String source, String destination, float montant, String date_reservation) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.adresse = adresse;
        this.telephone = telephone;
        this.compagnie = compagnie;
        this.date_depart = date_depart;
        this.heure_depart= heure_depart;
        this.source = source;
        this.destination = destination;
        this.montant = montant;
        this.date_reservation = date_reservation;
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

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public String getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(String date_depart) {
        this.date_depart = date_depart;
    }

    public String getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(String heure_depart) {
        this.heure_depart = heure_depart;
    }
    
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(String date_reservation) {
        this.date_reservation = date_reservation;
    }
    
    
}
