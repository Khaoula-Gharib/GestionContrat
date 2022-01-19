package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Devis;
import com.example.gestioncontrat.bean.Produit;
import com.example.gestioncontrat.dao.DevisDao;
import com.example.gestioncontrat.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevisService {
    @Autowired
    private DevisDao devisDao;

    public List<Devis> findAll() {return devisDao.findAll();}

    public  Devis save(Devis entity) {return devisDao.save(entity);}

    public  Devis findById(Long aLong) {return devisDao.findById(aLong).get();}

    public void deleteById(Long aLong) {devisDao.deleteById(aLong);}

    public void delete(Devis entity) {devisDao.delete(entity);}

    public Devis update(Long id, Devis devis) {
        Devis devis1 =new Devis();
        devis1=this.findById(id);
        devis1.setDateDevis(devis.getDateDevis());
        devis1.setLigneClients(devis.getLigneClients());
        devis1.setProduits(devis.getProduits());
        this.save(devis1);
        return devis1;
    }
}
