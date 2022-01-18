package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.bean.Produit;
import com.example.gestioncontrat.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;

    public List<Produit> findAll() {return produitDao.findAll();}

    public  Produit save(Produit entity) {return produitDao.save(entity);}

    public  Produit findById(Long aLong) {return produitDao.findById(aLong).get();}

    public void deleteById(Long aLong) {produitDao.deleteById(aLong);}

    public void delete(Produit entity) {produitDao.delete(entity);}

    public Produit update(Long id, Produit produit) {
        Produit produit1 =new Produit();
        produit1=this.findById(id);
        produit1.setNom(produit.getNom());
        produit1.setDescription(produit.getDescription());
        produit1.setPrix(produit.getPrix());
        produit1.setLigneProduits(produit.getLigneProduits());
        produit1.setDevis(produit.getDevis());
        this.save(produit1);
        return produit1;
    }
}
