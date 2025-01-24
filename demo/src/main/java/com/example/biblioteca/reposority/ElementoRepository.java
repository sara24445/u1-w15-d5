package com.example.biblioteca.reposority;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.entity.Elemento;

import java.util.List;

public interface ElementoRepository extends JpaRepository<Elemento, String> {
    List<Elemento> findByAnnoPubblicazione(int anno);
    List<Elemento> findByTitoloContaining(String titolo);
    List<Elemento> findByAutore(String autore);
    // Altri metodi personalizzati
}
