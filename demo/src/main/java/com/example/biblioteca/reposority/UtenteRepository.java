package com.example.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.entity.Utente;

public interface UtenteRepository extends JpaRepository<Utente, String> {
    // Altri metodi di ricerca
}