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

    public LigneClient update(LigneClient ligneClient) {
        Optional<LigneClient> ligneClient1 = ligneClientDao.findById(ligneClient.getId());
        if(ligneClient1 == null || !ligneClient1.isPresent()) {
            return null;
        }
        else {
            ligneClientDao.save(ligneClient);
            return ligneClient;
        }
    }
}
