package com.example.gestioncontrat.rest;

import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.bean.Produit;
import com.example.gestioncontrat.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
public class ProduitWs {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/")
    public List<Produit> findAll() {return produitService.findAll();}

    @PostMapping("/")
    public Produit save(@RequestBody Produit entity) {return produitService.save(entity);}

    @GetMapping("/id/{id}")
    public Produit findById(@PathVariable Long id) {return produitService.findById(id);}

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {produitService.deleteById(id);}

    @DeleteMapping("/")
    public void delete(Produit entity) { produitService.delete(entity);}

    @PutMapping("/update/{id}")
    public Produit update(@PathVariable long id, @RequestBody Produit produit) {
        return produitService.update(id, produit);
    }
}
