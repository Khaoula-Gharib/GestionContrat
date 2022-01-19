package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Devis;
import com.example.gestioncontrat.bean.Produit;
import com.example.gestioncontrat.dao.DevisDao;
import com.example.gestioncontrat.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DevisService {
    @Autowired
    private DevisDao devisDao;

    public List<Devis> findAll() {return devisDao.findAll();}

    public  Devis save(Devis entity) {return devisDao.save(entity);}

    public  Devis findById(Long aLong) {return devisDao.findById(aLong).get();}

    public void deleteById(Long aLong) {devisDao.deleteById(aLong);}

    public void delete(Devis entity) {devisDao.delete(entity);}

    public Devis update(Devis devis) {
        Optional<Devis> devis1 = devisDao.findById(devis.getId());
        if(devis1 == null || !devis1.isPresent()) {
            return null;
        }
        else {
            devisDao.save(devis);
            return devis;
        }
    }
}
