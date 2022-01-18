package com.example.gestioncontrat.rest;

import com.example.gestioncontrat.bean.client;
import com.example.gestioncontrat.service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class clientWs {

    @Autowired
    private clientService clientService;

    @GetMapping("/")
    public List<client> findAll() {
        return clientService.findAll();
    }

    @PostMapping("/")
    @ResponseBody
    public client save(@RequestBody client entity) {
        return clientService.save(entity);
    }

    @GetMapping("/id/{id}")
    public client findById(@PathVariable("id") Long aLong) {
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
    public client update(@PathVariable long id, @RequestBody client cl) {
        return clientService.update(id, cl);
    }
}
