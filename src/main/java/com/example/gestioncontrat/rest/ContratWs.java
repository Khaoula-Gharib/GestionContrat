package com.example.gestioncontrat.rest;

import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.bean.LigneProduit;
import com.example.gestioncontrat.service.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/contrat")
public class ContratWs {

    @Autowired
    private ContratService contratService;

    @GetMapping("/")
    public List<Contrat> findAll() {return contratService.findAll();}

    @PostMapping("/")
    public Contrat save(@RequestBody Contrat entity) {return contratService.save(entity);}

    @GetMapping("/id/{id}")
    public Contrat findById(@PathVariable Long id) {return contratService.findById(id);}

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {contratService.deleteById(id);}

    @DeleteMapping("/")
    public void delete(Contrat entity) { contratService.delete(entity);}

    @PutMapping("/update")
    public Contrat update(@RequestBody Contrat contrat) {
        return contratService.update(contrat);
    }
}
