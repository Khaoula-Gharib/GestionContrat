package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.client;
import com.example.gestioncontrat.dao.clientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class clientService {

    @Autowired
    private clientDao clientDao;

    public List<client> findAll() {
        return clientDao.findAll();
    }

    public client save(client entity) {
        return clientDao.save(entity);
    }

    public client findById(Long aLong) {
        return clientDao.findById(aLong).get();
    }

    public void deleteById(Long aLong) {
        clientDao.deleteById(aLong);
    }



    public void deleteAll() {
        clientDao.deleteAll();
    }

    public client update(long id, client cl) {
        client cl1=new client();
        cl1=this.findById(id);
        cl1.setNom(cl.getNom());
        cl1.setPrenom(cl.getPrenom());
        cl1.setAdresse(cl.getAdresse());
        cl1.setNumTel(cl.getNumTel());
        cl1.setNumCompte(cl.getNumCompte());
        cl1.setNumCin(cl.getNumCin());
        this.save(cl1);
        return cl1;
    }

}
