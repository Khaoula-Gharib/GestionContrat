package com.example.gestioncontrat.rest;

import com.example.gestioncontrat.bean.Client;
import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("api/client")
public class ClientWs {

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PostMapping("/")
    @ResponseBody
    public Client save(@RequestBody Client entity) {
        return clientService.save(entity);
    }

    @GetMapping("/id/{id}")
    public Client findById(@PathVariable("id") Long aLong) {
        return clientService.findById(aLong);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long aLong) {
        clientService.deleteById(aLong);
    }

    @DeleteMapping("/")
    public void deleteAll() {
        clientService.deleteAll();
    }
    @PutMapping("/update/{id}")
    public Client update(@RequestBody Client client) {
        return clientService.update(client);
    }
}
