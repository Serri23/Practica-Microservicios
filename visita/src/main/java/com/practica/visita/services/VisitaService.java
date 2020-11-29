package com.practica.visita.services;

import com.practica.entidadesMySQL.domains.Visita;
import com.practica.visita.repositories.VisitaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VisitaService {

    @Autowired
    private VisitaRepository visitaRepository;

    public Optional<Visita> getVisitaById(int visitaId) {
        return visitaRepository.findById(visitaId);
    }
}
