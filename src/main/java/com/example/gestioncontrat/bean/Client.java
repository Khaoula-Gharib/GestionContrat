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
    private Long NumTel;
    private Long NumCompte;
    private String NumCin;
    @OneToMany(mappedBy = "client")
    private List<LigneClient> ligneClients;
    @OneToMany(mappedBy = "client")
    private List<Contrat> contrats;

    public List<Contrat> getContrats() {
        return contrats;
    }

    public void setContrats(List<Contrat> contrats) {
        this.contrats = contrats;
    }

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

    public Long getNumTel() {
        return NumTel;
    }

    public void setNumTel(Long numTel) {
        NumTel = numTel;
    }

    public Long getNumCompte() {
        return NumCompte;
    }

    public void setNumCompte(Long numCompte) {
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
                ", contrats=" + contrats +
                '}';
    }
}
