package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.LigneClient;
import com.example.gestioncontrat.bean.LigneProduit;
import com.example.gestioncontrat.dao.LigneClientDao;
import com.example.gestioncontrat.dao.LigneProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LigneClientService {

    @Autowired
    private LigneClientDao ligneClientDao;

    public List findAll() {
        return ligneClientDao.findAll();
    }

    public LigneClient save(LigneClient entity) {
        return  ligneClientDao.save(entity);
    }

    public LigneClient findById(Long id) {
        return  ligneClientDao.findById(id).get();
    }

    public void deleteById(Long aLong) {ligneClientDao.deleteById(aLong);}


    public void deleteAll() {
        ligneClientDao.deleteAll();
    }

    public LigneClient update(Long id, LigneClient ligneClient) {
        LigneClient ligneClient1 =new LigneClient();
        ligneClient1=this.findById(id);
        ligneClient1.setQuantite(ligneClient.getQuantite());
        ligneClient1.setClient(ligneClient.getClient());
       // ligneProduit1.setContrat(ligneClient.getContrat());
        this.save(ligneClient1);
        return ligneClient1;
    }
}
