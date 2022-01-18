package com.example.gestioncontrat.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

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
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Client client;

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
    @JsonIgnore
    public List<LigneProduit> getLigneProduits() {
        return ligneProduits;
    }

    @JsonSetter
    public void setLigneProduits(List<LigneProduit> ligneProduits) {
        this.ligneProduits = ligneProduits;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", ligneProduits=" + ligneProduits +
                ", fournisseur=" + fournisseur +
                ", client=" + client +
                '}';
    }
}
