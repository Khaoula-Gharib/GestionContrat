package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Client;
import com.example.gestioncontrat.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientDao clientDao;

    public List<Client> findAll() {
        return clientDao.findAll();
    }

    public Client save(Client entity) {
        return clientDao.save(entity);
    }

    public Client findById(Long aLong) {
        return clientDao.findById(aLong).get();
    }

    public void deleteById(Long aLong) {
        clientDao.deleteById(aLong);
    }



    public void deleteAll() {
        clientDao.deleteAll();
    }

    public Client update(long id, Client cl) {
        Client cl1=new Client();
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
