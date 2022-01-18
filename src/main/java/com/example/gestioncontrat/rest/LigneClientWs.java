package com.example.gestioncontrat.rest;

import com.example.gestioncontrat.bean.LigneClient;
import com.example.gestioncontrat.service.LigneClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/LigneClient")
public class LigneClientWs {

    @Autowired
    private LigneClientService ligneClientService;

    @GetMapping("/")
    public List findAll() {
        return ligneClientService.findAll();
    }

    @PostMapping("/")
    public LigneClient save(@RequestBody LigneClient entity) {
        return ligneClientService.save(entity);
    }

    @GetMapping("/id/{id}")
    public LigneClient findById(@PathVariable Long id) {
        return ligneClientService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {ligneClientService.deleteById(id);}


    @DeleteMapping("/")
    public void deleteAll() {
        ligneClientService.deleteAll();
    }

    @PutMapping("/update/{id}")
    public LigneClient update(@PathVariable long id, @RequestBody LigneClient ligneClient) {
        return ligneClientService.update(id, ligneClient);
    }
}
