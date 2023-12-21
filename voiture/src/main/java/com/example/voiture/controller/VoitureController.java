package com.example.voiture.controller;


import com.example.voiture.entities.Voiture;
import com.example.voiture.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {
    @Autowired
    VoitureRepository clientRepository;

    @GetMapping("/voiture")
    public List chercherClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/voiture/{id}")
    public Voiture chercherUnVoiture(@PathVariable Long id) throws Exception {

        return this.clientRepository.findById(id).orElseThrow(() -> new Exception("Voitre inexistnt"));
    }
}