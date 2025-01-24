package com.example.biblioteca.Service;

import com.esempio.biblioteca.entity.Elemento;
import com.esempio.biblioteca.repository.ElementoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaService {
    @Autowired
    private ElementoRepository elementoRepo;

    public void aggiungiElemento(Elemento elemento) {
        elementoRepo.save(elemento);
    }
    
    public void rimuoviElemento(String isbn) {
        elementoRepo.deleteById(isbn);
    }
    
    public List<Elemento> cercaPerAnnoPubblicazione(int anno) {
        return elementoRepo.findByAnnoPubblicazione(anno);
    }

    public List<Elemento> cercaPerTitolo(String titolo) {
        return elementoRepo.findByTitoloContaining(titolo);
    }

    // Altri metodi di ricerca...
}
