package com.example.gestioncontrat.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Devis {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Date dateDevis;
    @OneToMany(mappedBy = "devis")
    private List<LigneClient> ligneClients;

    @Override
    public String toString() {
        return "Devis{" +
                "id=" + id +
                ", dateDevis=" + dateDevis +
                ", ligneClients=" + ligneClients +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDevis() {
        return dateDevis;
    }

    public void setDateDevis(Date dateDevis) {
        this.dateDevis = dateDevis;
    }

    public List<LigneClient> getLigneClients() {
        return ligneClients;
    }

    public void setLigneClients(List<LigneClient> ligneClients) {
        this.ligneClients = ligneClients;
    }
}
