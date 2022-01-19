package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.bean.LigneProduit;
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

    public Contrat update(Contrat contrat) {
        Optional<Contrat> contrat1 = contratDao.findById(contrat.getId());
        if(contrat1 == null || !contrat1.isPresent()) {
            return null;
        }
        else {
            contratDao.save(contrat);
            return contrat;
        }
    }
}
