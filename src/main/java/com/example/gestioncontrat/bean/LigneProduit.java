package com.example.gestioncontrat.bean;

import javax.persistence.*;

@Entity
public class LigneProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long quantite;
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Produit produit;
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Contrat contrat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantite() {
        return quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    @Override
    public String toString() {
        return "LigneProduit{" +
                "id=" + id +
                ", quantite=" + quantite +
                ", produit=" + produit +
                ", contrat=" + contrat +
                '}';
    }
}
