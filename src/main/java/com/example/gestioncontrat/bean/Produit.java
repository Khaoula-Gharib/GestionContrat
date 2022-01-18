package com.example.gestioncontrat.bean;

import javax.persistence.*;
import java.util.List;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;
    private Double prix;
    @OneToMany(mappedBy = "produit")
    private List<LigneProduit> ligneProduits;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public List<LigneProduit> getLigneProduits() {
        return ligneProduits;
    }

    public void setLigneProduits(List<LigneProduit> ligneProduits) {
        this.ligneProduits = ligneProduits;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", ligneProduits=" + ligneProduits +
                '}';
    }
}
