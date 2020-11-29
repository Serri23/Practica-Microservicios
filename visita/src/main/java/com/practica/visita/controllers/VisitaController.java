package com.practica.visita.controllers;

import com.practica.entidadesMySQL.domains.Visita;
import com.practica.visita.services.VisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class VisitaController {
    @Autowired
    private VisitaService visitaService;

    @GetMapping("/api/visita/{id}")
    public Optional<Visita> getVisitaById(@PathVariable ("id") int visitaId){
        return visitaService.getVisitaById(visitaId);
    }
}
