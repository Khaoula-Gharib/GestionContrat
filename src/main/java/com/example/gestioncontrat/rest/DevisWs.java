package com.example.gestioncontrat.rest;

import com.example.gestioncontrat.bean.Contrat;
import com.example.gestioncontrat.bean.Devis;
import com.example.gestioncontrat.bean.Produit;
import com.example.gestioncontrat.service.DevisService;
import com.example.gestioncontrat.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/devis")
public class DevisWs {
    @Autowired
    private DevisService devisService;

    @GetMapping("/")
    public List<Devis> findAll() {return devisService.findAll();}

    @PostMapping("/")
    public Devis save(@RequestBody Devis entity) {return devisService.save(entity);}

    @GetMapping("/id/{id}")
    public Devis findById(@PathVariable Long id) {return devisService.findById(id);}

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {devisService.deleteById(id);}

    @DeleteMapping("/")
    public void delete(Devis entity) { devisService.delete(entity);}

    @PutMapping("/update/{id}")
    public Devis update(@RequestBody Devis devis) {
        return devisService.update(devis);
    }
}
