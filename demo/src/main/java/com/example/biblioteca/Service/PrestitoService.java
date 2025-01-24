package com.example.biblioteca.Service;

import com.esempio.biblioteca.entity.Elemento;
import com.esempio.biblioteca.entity.Prestito;
import com.esempio.biblioteca.entity.Utente;
import com.esempio.biblioteca.repository.PrestitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PrestitoService {
    @Autowired
    private PrestitoRepository prestitoRepo;

    public void creaPrestito(Utente utente, Elemento elemento) {
        Prestito prestito = new Prestito();
        prestito.setUtente(utente);
        prestito.setElemento(elemento);
        prestito.setDataInizioPrestito(LocalDate.now());
        prestito.setDataRestituzionePrevista(LocalDate.now().plusDays(30)); // Calcolato automaticamente
        prestitoRepo.save(prestito);
    }

    // Metodi per ricerca di prestiti scaduti
}
