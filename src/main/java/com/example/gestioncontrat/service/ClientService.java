package com.example.gestioncontrat.service;

import com.example.gestioncontrat.bean.Client;
import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Client update(Client client) {
        Optional<Client> client1 = clientDao.findById(client.getId());
        if(client1 == null || !client1.isPresent()) {
            return null;
        }
        else {
            clientDao.save(client);
            return client;
        }
    }

}
