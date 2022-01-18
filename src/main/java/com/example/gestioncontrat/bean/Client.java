package com.example.gestioncontrat.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private int NumTel;
    private int NumCompte;
    private String NumCin;
    @OneToMany(mappedBy = "client")
    private List<LigneClient> ligneClients;

    public List<LigneClient> getLigneClients() {
        return ligneClients;
    }

    public void setLigneClients(List<LigneClient> ligneClients) {
        this.ligneClients = ligneClients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNumTel() {
        return NumTel;
    }

    public void setNumTel(int numTel) {
        NumTel = numTel;
    }

    public int getNumCompte() {
        return NumCompte;
    }

    public void setNumCompte(int numCompte) {
        NumCompte = numCompte;
    }

    public String getNumCin() {
        return NumCin;
    }

    public void setNumCin(String numCin) {
        NumCin = numCin;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", NumTel=" + NumTel +
                ", NumCompte=" + NumCompte +
                ", NumCin='" + NumCin + '\'' +
                ", ligneClients=" + ligneClients +
                '}';
    }
}
