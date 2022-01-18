package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.bean.Fournisseur;
import com.example.gestioncontrat.dao.FournisseurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurDao fournisseurDao;

    public List<Fournisseur> findAll() {return fournisseurDao.findAll();}

    public  Fournisseur save(Fournisseur entity) {return fournisseurDao.save(entity);}

    public  Fournisseur findById(Long aLong) {return fournisseurDao.findById(aLong).get();}

    public void deleteById(Long aLong) {fournisseurDao.deleteById(aLong);}

    public void delete(Fournisseur entity) {fournisseurDao.delete(entity);}

    public Fournisseur update(Long id, Fournisseur fournisseur) {
        Fournisseur fournisseur1 =new Fournisseur();
        fournisseur1=this.findById(id);
        fournisseur1.setNom(fournisseur.getNom());
        fournisseur1.setAdresse(fournisseur.getAdresse());
        fournisseur1.setNumTel(fournisseur.getNumTel());
        fournisseur1.setNumCompte(fournisseur.getNumCompte());
        fournisseur1.setContrats(fournisseur.getContrats());
        this.save(fournisseur1);
        return fournisseur1;
    }
}
