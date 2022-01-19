package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Fournisseur;
import com.example.gestioncontrat.bean.LigneProduit;
import com.example.gestioncontrat.bean.Produit;
import com.example.gestioncontrat.dao.LigneProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LigneProduitService {
    @Autowired
    private LigneProduitDao ligneProduitDao;

    public List<LigneProduit> findAll() {return ligneProduitDao.findAll();}

    public  LigneProduit save(LigneProduit entity) {return ligneProduitDao.save(entity);}

    public  LigneProduit findById(Long aLong) {return ligneProduitDao.findById(aLong).get();}

    public void deleteById(Long aLong) {ligneProduitDao.deleteById(aLong);}

    public void delete(LigneProduit entity) {ligneProduitDao.delete(entity);}

    public LigneProduit update(LigneProduit ligneProduit) {
        Optional<LigneProduit> ligneProduit1 = ligneProduitDao.findById(ligneProduit.getId());
        if(ligneProduit1 == null || !ligneProduit1.isPresent()) {
            return null;
        }
        else {
            ligneProduitDao.save(ligneProduit);
            return ligneProduit;
        }
    }
}
