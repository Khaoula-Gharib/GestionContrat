package com.example.gestioncontrat.rest;

import com.example.gestioncontrat.bean.Fournisseur;
import com.example.gestioncontrat.bean.LigneProduit;
import com.example.gestioncontrat.bean.Produit;
import com.example.gestioncontrat.service.LigneProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/ligneproduit")
public class LigneProduitWs {
    @Autowired
    private LigneProduitService ligneProduitService;

    @GetMapping("/")
    public List<LigneProduit> findAll() {return ligneProduitService.findAll();}

    @PostMapping("/")
    public LigneProduit save(@RequestBody LigneProduit entity) {return ligneProduitService.save(entity);}

    @GetMapping("/id/{id}")
    public LigneProduit findById(@PathVariable Long id) {return ligneProduitService.findById(id);}

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {ligneProduitService.deleteById(id);}

    @DeleteMapping("/")
    public void delete(LigneProduit entity) { ligneProduitService.delete(entity);}

    @PutMapping("/update")
    public LigneProduit update(@RequestBody LigneProduit ligneProduit) {
        return ligneProduitService.update(ligneProduit);
    }

}
