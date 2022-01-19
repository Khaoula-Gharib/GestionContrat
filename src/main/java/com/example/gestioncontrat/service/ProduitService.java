package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.bean.Fournisseur;
import com.example.gestioncontrat.bean.Produit;
import com.example.gestioncontrat.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {
    @Autowired
    private ProduitDao produitDao;

    public List<Produit> findAll() {return produitDao.findAll();}

    public  Produit save(Produit entity) {return produitDao.save(entity);}

    public  Produit findById(Long aLong) {return produitDao.findById(aLong).get();}

    public void deleteById(Long aLong) {produitDao.deleteById(aLong);}

    public void delete(Produit entity) {produitDao.delete(entity);}

    public Produit update(Produit produit) {
        Optional<Produit> produit1 = produitDao.findById(produit.getId());
        if(produit1 == null || !produit1.isPresent()) {
            return null;
        }
        else {
            produitDao.save(produit);
            return produit;
        }
    }
}
