package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.LigneProduit;
import com.example.gestioncontrat.bean.Produit;
import com.example.gestioncontrat.dao.LigneProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneProduitService {
    @Autowired
    private LigneProduitDao ligneProduitDao;

    public List<LigneProduit> findAll() {return ligneProduitDao.findAll();}

    public  LigneProduit save(LigneProduit entity) {return ligneProduitDao.save(entity);}

    public  LigneProduit findById(Long aLong) {return ligneProduitDao.findById(aLong).get();}

    public void deleteById(Long aLong) {ligneProduitDao.deleteById(aLong);}

    public void delete(LigneProduit entity) {ligneProduitDao.delete(entity);}

    public LigneProduit update(Long id, LigneProduit ligneProduit) {
        LigneProduit ligneProduit1 =new LigneProduit();
        ligneProduit1=this.findById(id);
        ligneProduit1.setQuantite(ligneProduit.getQuantite());
        ligneProduit1.setProduit(ligneProduit.getProduit());
        ligneProduit1.setContrat(ligneProduit.getContrat());
        this.save(ligneProduit1);
        return ligneProduit1;
    }
}
