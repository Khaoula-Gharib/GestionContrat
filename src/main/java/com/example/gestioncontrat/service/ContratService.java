package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.dao.ContratDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratService {
    @Autowired
    private ContratDao contratDao;

    public List<Contrat> findAll() {return contratDao.findAll();}

    public  Contrat save(Contrat entity) {return contratDao.save(entity);}

    public  Contrat findById(Long aLong) {return contratDao.findById(aLong).get();}

    public void deleteById(Long aLong) {contratDao.deleteById(aLong);}

    public void delete(Contrat entity) {contratDao.delete(entity);}

    public Contrat update(Long id, Contrat contrat) {
        Contrat contrat1 =new Contrat();
        contrat1=this.findById(id);
        contrat1.setLibelle(contrat.getLibelle());
        contrat1.setDescription(contrat.getDescription());
        contrat1.setLigneProduits(contrat.getLigneProduits());
        contrat1.setFournisseur(contrat.getFournisseur());
        contrat1.setClient(contrat.getClient());
        this.save(contrat1);
        return contrat1;
    }
}
