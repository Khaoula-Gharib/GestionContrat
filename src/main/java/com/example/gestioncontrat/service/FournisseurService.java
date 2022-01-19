package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.bean.Fournisseur;
import com.example.gestioncontrat.dao.FournisseurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurDao fournisseurDao;

    public List<Fournisseur> findAll() {return fournisseurDao.findAll();}

    public  Fournisseur save(Fournisseur entity) {return fournisseurDao.save(entity);}

    public  Fournisseur findById(Long aLong) {return fournisseurDao.findById(aLong).get();}

    public void deleteById(Long aLong) {fournisseurDao.deleteById(aLong);}

    public void delete(Fournisseur entity) {fournisseurDao.delete(entity);}

    public Fournisseur update(Fournisseur fournisseur) {
        Optional<Fournisseur> fournisseur1 = fournisseurDao.findById(fournisseur.getId());
            if(fournisseur1 == null || !fournisseur1.isPresent()) {
            return null;
        }
            else {
            fournisseurDao.save(fournisseur);
            return fournisseur;
        }
    }
}
