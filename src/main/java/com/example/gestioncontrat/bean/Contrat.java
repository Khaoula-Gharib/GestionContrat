package com.example.gestioncontrat.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private String description;
    @OneToMany(mappedBy = "contrat")
    private List<LigneProduit> ligneProduits;
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Fournisseur fournisseur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LigneProduit> getLigneProduits() {
        return ligneProduits;
    }

    public void setLigneProduits(List<LigneProduit> ligneProduits) {
        this.ligneProduits = ligneProduits;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", ligneProduits=" + ligneProduits +
                ", fournisseur=" + fournisseur +
                '}';
    }
}
