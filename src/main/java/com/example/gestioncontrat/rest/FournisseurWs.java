package com.example.gestioncontrat.rest;

import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.bean.Fournisseur;
import com.example.gestioncontrat.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/fournisseur")
public class FournisseurWs {
    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping("/")
    public List<Fournisseur> findAll() {return fournisseurService.findAll();}

    @PostMapping("/")
    public Fournisseur save(@RequestBody Fournisseur entity) {return fournisseurService.save(entity);}

    @GetMapping("/id/{id}")
    public Fournisseur findById(@PathVariable Long id) {return fournisseurService.findById(id);}

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable("id") Long id) {fournisseurService.deleteById(id);}

    @DeleteMapping("/")
    public void delete(Fournisseur entity) { fournisseurService.delete(entity);}

    @PutMapping("/update")
    public Fournisseur update( @RequestBody Fournisseur fournisseur) {
        return fournisseurService.update(fournisseur);
    }
}
