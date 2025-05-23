package tn.esprit.fournisseur;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String nom;

    public fournisseur( ) {

    }
    public fournisseur(String nom) {
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
