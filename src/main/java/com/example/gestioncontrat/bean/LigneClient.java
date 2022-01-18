package com.example.gestioncontrat.bean;

import javax.persistence.*;

@Entity
public class LigneClient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantite;
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Client client;
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Devis devis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "LigneClient{" +
                "id=" + id +
                ", quantite=" + quantite +
                ", client=" + client +
                '}';
    }
}
